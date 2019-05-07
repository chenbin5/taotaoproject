package com.taotao.service;

import com.taotao.pojo.TbItem;

import java.util.List;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/6 18:23
 */
public interface ItemService {

    public List<TbItem> queryItemInfo(TbItem tbItem);
}
