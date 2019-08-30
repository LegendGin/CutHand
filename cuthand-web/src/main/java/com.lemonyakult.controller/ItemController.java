package com.lemonyakult.controller;

import com.lemonyakult.common.bean.EasyUIDataGridResult;
import com.lemonyakult.pojo.TbItem;
import com.lemonyakult.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("item")
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        System.out.println("hello world");
        TbItem tbItem = itemService.getItemById(itemId);
        System.out.println(tbItem == null ? "null" : tbItem.getTitle());
        return tbItem;
    }

    @RequestMapping("list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        System.out.println("hello world");
        EasyUIDataGridResult tbItems = itemService.getItemList(page, rows);
        return tbItems;
    }
}
