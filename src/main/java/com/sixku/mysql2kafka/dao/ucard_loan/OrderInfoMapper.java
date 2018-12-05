package com.sixku.mysql2kafka.dao.ucard_loan;

import com.sixku.mysql2kafka.dao.ucard_loan.domain.OrderInfo;
import com.sixku.mysql2kafka.dao.ucard_loan.domain.OrderInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderInfoMapper {
    long countByExample(OrderInfoExample example);

    int deleteByExample(OrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExampleWithBLOBs(OrderInfoExample example);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKeyWithBLOBs(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    OrderInfo selectByOrderId(String orderId);
}