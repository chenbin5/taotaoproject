package com.taotao.controller;

import com.alibaba.fastjson.JSONObject;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/6 18:15
 */
@Controller
@RequestMapping(value = "/test",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
public class TestController {

    @Autowired(required = false)
    private ItemService itemService;

    @RequestMapping("/toTestPage")
    public ModelAndView toTestPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test/addTest");
        return modelAndView;
    }


    @RequestMapping("/toPicturePage")
    public ModelAndView toPicturePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test/pictures");
        return modelAndView;
    }

    @RequestMapping(value = "/getItemInfo",method = RequestMethod.GET)
    @ResponseBody
    public String getItemInfo() {
        System.out.println("进来了");
        TbItem tbItem = new TbItem();
        tbItem.setCid(76L);
        List<TbItem> list = itemService.queryItemInfo(tbItem);
        return JSONObject.toJSONString(list);
    }
}
