package com.lemonyakult.controller;

import com.lemonyakult.common.bean.EasyUITreeNode;
import com.lemonyakult.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequestMapping("item/cat")
@Controller
public class ItemCategoryController {

    @Autowired
    private ItemCategoryService categoryService;

    @RequestMapping("list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCategories(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
        System.out.println("getItemCategories");
        List<EasyUITreeNode> cats = categoryService.getCategoryList(parentId);
        System.out.println("size:" + cats.size());
        return cats;
    }

}
