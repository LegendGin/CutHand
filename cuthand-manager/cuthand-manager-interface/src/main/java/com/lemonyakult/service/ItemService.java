package com.lemonyakult.service;

import com.lemonyakult.common.bean.EasyUIDataGridResult;
import com.lemonyakult.pojo.TbItem;

public interface ItemService {
    TbItem getItemById(long itemId);
    EasyUIDataGridResult getItemList(int page, int rows);
}
