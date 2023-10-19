package com.yyx.prd.admin.service;


import com.yyx.prd.model.admin.PrdAdmin;
import com.yyx.prd.model.product.PrdPermission;

import java.util.List;

/**
 * @description:
 * @author：karma
 * @date: 2023/10/17
 */
public interface PrdAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    PrdAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    PrdAdmin register(PrdAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    List<PrdPermission> getPermissionList(Long id);

    String getusername();
}
