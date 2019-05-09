package com.taotao.service.impl;


import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.List;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/6 18:23
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    public List<TbItem> queryItemInfo(TbItem tbItem) {

        TbItemExample tbItemExample = new TbItemExample();
        Criteria criteria = tbItemExample.createCriteria();
        if (!StringUtils.isEmpty(tbItem.getCid())) {
            criteria.andCidEqualTo(tbItem.getCid());
        }
        List<TbItem> list = tbItemMapper.selectByExample(tbItemExample);
        return list;
    }
}
