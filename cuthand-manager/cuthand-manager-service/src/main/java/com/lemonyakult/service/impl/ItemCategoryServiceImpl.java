package com.lemonyakult.service.impl;

import com.lemonyakult.common.bean.EasyUITreeNode;
import com.lemonyakult.dao.TbItemCatDao;
import com.lemonyakult.pojo.TbItemCat;
import com.lemonyakult.pojo.TbItemCatQuery;
import com.lemonyakult.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Autowired
    private TbItemCatDao itemCatDao;

    @Override
    public List<EasyUITreeNode> getCategoryList(long parentId) {
        //根据父节点id查询子节点列表
        TbItemCatQuery example = new TbItemCatQuery();
        //设置查询条件
        TbItemCatQuery.Criteria criteria = example.createCriteria();
        //设置parentid
        criteria.andParentIdEqualTo(parentId);
        //执行查询
        List<TbItemCat> list = itemCatDao.selectByExample(example);
        //转换成EasyUITreeNode列表
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (TbItemCat tbItemCat : list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            //如果节点下有子节点“closed”，如果没有子节点“open”
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            //添加到节点列表
            resultList.add(node);
        }
        return resultList;
    }
}
