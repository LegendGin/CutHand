package com.lemonyakult.service;

import com.lemonyakult.common.bean.EasyUITreeNode;

import java.util.List;

public interface ItemCategoryService {
    List<EasyUITreeNode> getCategoryList(long parentId);
}
