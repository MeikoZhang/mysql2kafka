package com.sixku.mysql2kafka.dao.ucard_loan;

import com.sixku.mysql2kafka.dao.ucard_loan.domain.CustomerInfo;
import com.sixku.mysql2kafka.dao.ucard_loan.domain.CustomerInfoExample;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CustomerInfoMapper {
    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    CustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    CustomerInfo selectByCustomerId(String customerId);

//    @Select("select * from customer_info where customer_id = #{customerId,jdbcType=VARCHAR}")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
//    CustomerInfo selectExample(String customerId);
}