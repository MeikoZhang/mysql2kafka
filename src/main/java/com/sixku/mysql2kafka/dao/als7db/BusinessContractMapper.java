package com.sixku.mysql2kafka.dao.als7db;

import com.sixku.mysql2kafka.dao.als7db.domain.BusinessContract;
import com.sixku.mysql2kafka.dao.als7db.domain.BusinessContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessContractMapper {
    long countByExample(BusinessContractExample example);

    int deleteByExample(BusinessContractExample example);

    int deleteByPrimaryKey(String serialno);

    int insert(BusinessContract record);

    int insertSelective(BusinessContract record);

    List<BusinessContract> selectByExample(BusinessContractExample example);

    BusinessContract selectByPrimaryKey(String serialno);

    int updateByExampleSelective(@Param("record") BusinessContract record, @Param("example") BusinessContractExample example);

    int updateByExample(@Param("record") BusinessContract record, @Param("example") BusinessContractExample example);

    int updateByPrimaryKeySelective(BusinessContract record);

    int updateByPrimaryKey(BusinessContract record);
}