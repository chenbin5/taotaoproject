package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/15 10:04
 */
@Controller
@RequestMapping("/echarts")
public class EchartsController {


    @RequestMapping("/toEchartsPage")
    public ModelAndView toEchartsPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("echarts/echarts");
        return modelAndView;
    }
}
