package com.yyx.prd.mapper;

import com.yyx.prd.model.admin.PrdRole;
import com.yyx.prd.model.admin.PrdRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdRoleMapper {
    int countByExample(PrdRoleExample example);

    int deleteByExample(PrdRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdRole record);

    int insertSelective(PrdRole record);

    List<PrdRole> selectByExample(PrdRoleExample example);

    PrdRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdRole record, @Param("example") PrdRoleExample example);

    int updateByExample(@Param("record") PrdRole record, @Param("example") PrdRoleExample example);

    int updateByPrimaryKeySelective(PrdRole record);

    int updateByPrimaryKey(PrdRole record);
}