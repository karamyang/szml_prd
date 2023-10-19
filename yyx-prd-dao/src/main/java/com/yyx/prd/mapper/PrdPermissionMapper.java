package com.yyx.prd.mapper;

import com.yyx.prd.model.product.PrdPermission;
import com.yyx.prd.model.product.PrdPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdPermissionMapper {
    int countByExample(PrdPermissionExample example);

    int deleteByExample(PrdPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdPermission record);

    int insertSelective(PrdPermission record);

    List<PrdPermission> selectByExample(PrdPermissionExample example);

    PrdPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdPermission record, @Param("example") PrdPermissionExample example);

    int updateByExample(@Param("record") PrdPermission record, @Param("example") PrdPermissionExample example);

    int updateByPrimaryKeySelective(PrdPermission record);

    int updateByPrimaryKey(PrdPermission record);
}