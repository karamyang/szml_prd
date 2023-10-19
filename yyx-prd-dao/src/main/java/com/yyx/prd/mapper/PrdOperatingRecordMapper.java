package com.yyx.prd.mapper;

import com.yyx.prd.model.product.PrdOperatingRecord;
import com.yyx.prd.model.product.PrdOperatingRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrdOperatingRecordMapper {
    int countByExample(PrdOperatingRecordExample example);

    int deleteByExample(PrdOperatingRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PrdOperatingRecord record);

    int insertSelective(PrdOperatingRecord record);

    List<PrdOperatingRecord> selectByExample(PrdOperatingRecordExample example);

    PrdOperatingRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PrdOperatingRecord record, @Param("example") PrdOperatingRecordExample example);

    int updateByExample(@Param("record") PrdOperatingRecord record, @Param("example") PrdOperatingRecordExample example);

    int updateByPrimaryKeySelective(PrdOperatingRecord record);

    int updateByPrimaryKey(PrdOperatingRecord record);
}