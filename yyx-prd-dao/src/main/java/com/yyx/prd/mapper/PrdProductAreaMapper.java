package com.yyx.prd.mapper;

import com.yyx.prd.model.product.PrdProductArea;
import com.yyx.prd.model.product.PrdProductAreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdProductAreaMapper {
    int countByExample(PrdProductAreaExample example);

    int deleteByExample(PrdProductAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdProductArea record);

    int insertSelective(PrdProductArea record);

    List<PrdProductArea> selectByExample(PrdProductAreaExample example);

    PrdProductArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdProductArea record, @Param("example") PrdProductAreaExample example);

    int updateByExample(@Param("record") PrdProductArea record, @Param("example") PrdProductAreaExample example);

    int updateByPrimaryKeySelective(PrdProductArea record);

    int updateByPrimaryKey(PrdProductArea record);
}