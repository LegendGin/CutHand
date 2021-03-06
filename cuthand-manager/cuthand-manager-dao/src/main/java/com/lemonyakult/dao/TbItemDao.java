package com.lemonyakult.dao;

import com.lemonyakult.pojo.TbItem;
import com.lemonyakult.pojo.TbItemQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemDao {
    int countByExample(TbItemQuery example);

    int deleteByExample(TbItemQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    List<TbItem> selectByExample(TbItemQuery example);

    TbItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemQuery example);

    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemQuery example);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}