package com.sixku.mysql2kafka.dao.als7db;

import com.sixku.mysql2kafka.dao.als7db.domain.AcctLoan;
import com.sixku.mysql2kafka.dao.als7db.domain.AcctLoanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcctLoanMapper {
    long countByExample(AcctLoanExample example);

    int deleteByExample(AcctLoanExample example);

    int deleteByPrimaryKey(String serialno);

    int insert(AcctLoan record);

    int insertSelective(AcctLoan record);

    List<AcctLoan> selectByExample(AcctLoanExample example);

    AcctLoan selectByPrimaryKey(String serialno);

    int updateByExampleSelective(@Param("record") AcctLoan record, @Param("example") AcctLoanExample example);

    int updateByExample(@Param("record") AcctLoan record, @Param("example") AcctLoanExample example);

    int updateByPrimaryKeySelective(AcctLoan record);

    int updateByPrimaryKey(AcctLoan record);
}