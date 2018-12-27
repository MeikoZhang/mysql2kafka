package com.sixku.mysql2kafka.dao.als7db;

import com.sixku.mysql2kafka.dao.als7db.domain.BusinessTypeset;
import com.sixku.mysql2kafka.dao.als7db.domain.BusinessTypesetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessTypesetMapper {
    long countByExample(BusinessTypesetExample example);

    int deleteByExample(BusinessTypesetExample example);

    int deleteByPrimaryKey(String termno);

    int insert(BusinessTypeset record);

    int insertSelective(BusinessTypeset record);

    List<BusinessTypeset> selectByExample(BusinessTypesetExample example);

    BusinessTypeset selectByPrimaryKey(String termno);

    int updateByExampleSelective(@Param("record") BusinessTypeset record, @Param("example") BusinessTypesetExample example);

    int updateByExample(@Param("record") BusinessTypeset record, @Param("example") BusinessTypesetExample example);

    int updateByPrimaryKeySelective(BusinessTypeset record);

    int updateByPrimaryKey(BusinessTypeset record);
}