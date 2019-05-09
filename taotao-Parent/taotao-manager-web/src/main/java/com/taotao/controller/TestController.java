package com.taotao.controller;

import com.alibaba.fastjson.JSONObject;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/6 18:15
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ItemService itemService;


    @RequestMapping("/getItemInfo")
    @ResponseBody
    public String getItemInfo() {
        System.out.println("进来了");
        TbItem tbItem = new TbItem();
        tbItem.setCid(76L);
        List<TbItem> list = itemService.queryItemInfo(tbItem);
        return JSONObject.toJSONString(list);
    }
}
