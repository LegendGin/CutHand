package com.lemonyakult.dao;

import com.lemonyakult.pojo.TbItemDesc;
import com.lemonyakult.pojo.TbItemDescQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemDescDao {
    int countByExample(TbItemDescQuery example);

    int deleteByExample(TbItemDescQuery example);

    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDesc record);

    int insertSelective(TbItemDesc record);

    List<TbItemDesc> selectByExampleWithBLOBs(TbItemDescQuery example);

    List<TbItemDesc> selectByExample(TbItemDescQuery example);

    TbItemDesc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") TbItemDesc record, @Param("example") TbItemDescQuery example);

    int updateByExampleWithBLOBs(@Param("record") TbItemDesc record, @Param("example") TbItemDescQuery example);

    int updateByExample(@Param("record") TbItemDesc record, @Param("example") TbItemDescQuery example);

    int updateByPrimaryKeySelective(TbItemDesc record);

    int updateByPrimaryKeyWithBLOBs(TbItemDesc record);

    int updateByPrimaryKey(TbItemDesc record);
}