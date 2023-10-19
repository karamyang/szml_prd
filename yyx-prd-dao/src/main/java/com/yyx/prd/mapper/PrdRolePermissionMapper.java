package com.yyx.prd.mapper;

import com.yyx.prd.model.admin.PrdRolePermission;
import com.yyx.prd.model.admin.PrdRolePermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdRolePermissionMapper {
    int countByExample(PrdRolePermissionExample example);

    int deleteByExample(PrdRolePermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdRolePermission record);

    int insertSelective(PrdRolePermission record);

    List<PrdRolePermission> selectByExample(PrdRolePermissionExample example);

    PrdRolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdRolePermission record, @Param("example") PrdRolePermissionExample example);

    int updateByExample(@Param("record") PrdRolePermission record, @Param("example") PrdRolePermissionExample example);

    int updateByPrimaryKeySelective(PrdRolePermission record);

    int updateByPrimaryKey(PrdRolePermission record);
}