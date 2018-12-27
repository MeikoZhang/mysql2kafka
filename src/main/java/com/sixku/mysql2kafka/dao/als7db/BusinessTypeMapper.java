package com.sixku.mysql2kafka.dao.als7db;

import com.sixku.mysql2kafka.dao.als7db.domain.BusinessType;
import com.sixku.mysql2kafka.dao.als7db.domain.BusinessTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessTypeMapper {
    long countByExample(BusinessTypeExample example);

    int deleteByExample(BusinessTypeExample example);

    int deleteByPrimaryKey(String typeno);

    int insert(BusinessType record);

    int insertSelective(BusinessType record);

    List<BusinessType> selectByExample(BusinessTypeExample example);

    BusinessType selectByPrimaryKey(String typeno);

    int updateByExampleSelective(@Param("record") BusinessType record, @Param("example") BusinessTypeExample example);

    int updateByExample(@Param("record") BusinessType record, @Param("example") BusinessTypeExample example);

    int updateByPrimaryKeySelective(BusinessType record);

    int updateByPrimaryKey(BusinessType record);
}