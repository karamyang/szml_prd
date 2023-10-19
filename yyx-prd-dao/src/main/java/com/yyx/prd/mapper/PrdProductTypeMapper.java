package com.yyx.prd.mapper;

import com.yyx.prd.model.product.PrdProductType;
import com.yyx.prd.model.product.PrdProductTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdProductTypeMapper {
    int countByExample(PrdProductTypeExample example);

    int deleteByExample(PrdProductTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdProductType record);

    int insertSelective(PrdProductType record);

    List<PrdProductType> selectByExample(PrdProductTypeExample example);

    PrdProductType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdProductType record, @Param("example") PrdProductTypeExample example);

    int updateByExample(@Param("record") PrdProductType record, @Param("example") PrdProductTypeExample example);

    int updateByPrimaryKeySelective(PrdProductType record);

    int updateByPrimaryKey(PrdProductType record);
}