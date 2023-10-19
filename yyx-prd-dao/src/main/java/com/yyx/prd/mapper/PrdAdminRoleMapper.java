package com.yyx.prd.mapper;

import com.yyx.prd.model.admin.PrdAdminRole;
import com.yyx.prd.model.admin.PrdAdminRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdAdminRoleMapper {
    int countByExample(PrdAdminRoleExample example);

    int deleteByExample(PrdAdminRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdAdminRole record);

    int insertSelective(PrdAdminRole record);

    List<PrdAdminRole> selectByExample(PrdAdminRoleExample example);

    PrdAdminRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdAdminRole record, @Param("example") PrdAdminRoleExample example);

    int updateByExample(@Param("record") PrdAdminRole record, @Param("example") PrdAdminRoleExample example);

    int updateByPrimaryKeySelective(PrdAdminRole record);

    int updateByPrimaryKey(PrdAdminRole record);
}