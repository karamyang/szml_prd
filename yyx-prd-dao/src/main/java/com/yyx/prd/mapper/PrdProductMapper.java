package com.yyx.prd.mapper;

import com.yyx.prd.model.product.PrdProduct;
import com.yyx.prd.model.product.PrdProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdProductMapper {
    int countByExample(PrdProductExample example);

    int deleteByExample(PrdProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdProduct record);

    int insertSelective(PrdProduct record);

    List<PrdProduct> selectByExample(PrdProductExample example);

    PrdProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdProduct record, @Param("example") PrdProductExample example);

    int updateByExample(@Param("record") PrdProduct record, @Param("example") PrdProductExample example);

    int updateByPrimaryKeySelective(PrdProduct record);

    int updateByPrimaryKey(PrdProduct record);
}