package com.lemonyakult.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lemonyakult.common.bean.EasyUIDataGridResult;
import com.lemonyakult.dao.TbItemDao;
import com.lemonyakult.pojo.TbItem;
import com.lemonyakult.pojo.TbItemQuery;
import com.lemonyakult.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemDao itemDao;

    @Override
    public TbItem getItemById(long itemId) {
        TbItem tbItem = itemDao.selectByPrimaryKey(itemId);
        return tbItem;
    }

    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<TbItem> list = itemDao.selectByExample(new TbItemQuery());
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        result.setRows(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
