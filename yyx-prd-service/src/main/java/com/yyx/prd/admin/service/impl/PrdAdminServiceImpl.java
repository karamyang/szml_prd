package com.yyx.prd.admin.service.impl;

import com.yyx.prd.mapper.PrdAdminMapper;
import com.yyx.prd.mapper.PrdAdminRoleRelationDao;
import com.yyx.prd.model.admin.PrdAdmin;
import com.yyx.prd.model.admin.PrdAdminExample;
import com.yyx.prd.model.product.PrdPermission;
import com.yyx.prd.admin.service.PrdAdminService;
import com.yyx.prd.admin.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author：karma
 * @date: 2023/10/17
 */
@Service
public class PrdAdminServiceImpl  implements PrdAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrdAdminServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private PrdAdminMapper adminMapper;
    @Autowired
    private PrdAdminRoleRelationDao adminRoleRelationDao;
    @Override
    public PrdAdmin getAdminByUsername(String username) {
        PrdAdminExample example = new PrdAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<PrdAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public PrdAdmin register(PrdAdmin umsAdminParam) {
        PrdAdmin umsAdmin = new PrdAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        //查询是否有相同用户名的用户
        PrdAdminExample example = new PrdAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdmin.getUsername());
        List<PrdAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        adminMapper.insert(umsAdmin);
        return umsAdmin;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public List<PrdPermission> getPermissionList(Long id) {
        return adminRoleRelationDao.getPermissionList(id);
    }

    @Override
    public String getusername() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
