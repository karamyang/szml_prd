package com.yyx.prd.mapper;

import com.yyx.prd.model.product.PrdProductDraft;
import com.yyx.prd.model.product.PrdProductDraftExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdProductDraftMapper {
    int countByExample(PrdProductDraftExample example);

    int deleteByExample(PrdProductDraftExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdProductDraft record);

    int insertSelective(PrdProductDraft record);

    List<PrdProductDraft> selectByExample(PrdProductDraftExample example);

    PrdProductDraft selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdProductDraft record, @Param("example") PrdProductDraftExample example);

    int updateByExample(@Param("record") PrdProductDraft record, @Param("example") PrdProductDraftExample example);

    int updateByPrimaryKeySelective(PrdProductDraft record);

    int updateByPrimaryKey(PrdProductDraft record);

    List<PrdProductDraft> selectAdminProduct(String username);
}