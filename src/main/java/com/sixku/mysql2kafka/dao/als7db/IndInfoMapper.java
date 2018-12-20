package com.sixku.mysql2kafka.dao.als7db;

import com.sixku.mysql2kafka.dao.als7db.domain.IndInfo;
import com.sixku.mysql2kafka.dao.als7db.domain.IndInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndInfoMapper {
    long countByExample(IndInfoExample example);

    int deleteByExample(IndInfoExample example);

    int deleteByPrimaryKey(String customerid);

    int insert(IndInfo record);

    int insertSelective(IndInfo record);

    List<IndInfo> selectByExampleWithBLOBs(IndInfoExample example);

    List<IndInfo> selectByExample(IndInfoExample example);

    IndInfo selectByPrimaryKey(String customerid);

    int updateByExampleSelective(@Param("record") IndInfo record, @Param("example") IndInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") IndInfo record, @Param("example") IndInfoExample example);

    int updateByExample(@Param("record") IndInfo record, @Param("example") IndInfoExample example);

    int updateByPrimaryKeySelective(IndInfo record);

    int updateByPrimaryKeyWithBLOBs(IndInfo record);

    int updateByPrimaryKey(IndInfo record);

    List<IndInfo> selectByCertId(String certid);
}