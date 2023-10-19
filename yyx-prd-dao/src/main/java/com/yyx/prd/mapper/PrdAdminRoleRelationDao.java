package com.yyx.prd.mapper;


import com.yyx.prd.model.product.PrdPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * Created by macro on 2018/10/8.
 */
public interface PrdAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<PrdPermission> getPermissionList(@Param("adminId") Long adminId);
}
