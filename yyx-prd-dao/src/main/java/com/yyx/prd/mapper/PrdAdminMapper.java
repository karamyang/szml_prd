package com.yyx.prd.mapper;

import com.yyx.prd.model.admin.PrdAdmin;
import com.yyx.prd.model.admin.PrdAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdAdminMapper {
    int countByExample(PrdAdminExample example);

    int deleteByExample(PrdAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdAdmin record);

    int insertSelective(PrdAdmin record);

    List<PrdAdmin> selectByExample(PrdAdminExample example);

    PrdAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdAdmin record, @Param("example") PrdAdminExample example);

    int updateByExample(@Param("record") PrdAdmin record, @Param("example") PrdAdminExample example);

    int updateByPrimaryKeySelective(PrdAdmin record);

    int updateByPrimaryKey(PrdAdmin record);
}