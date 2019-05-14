package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 陈斌
 * @Description 用户登录控制器
 * @date 2019/5/14 10:04
 */
@Controller
@RequestMapping("/login")
public class LoginController {


    @RequestMapping("/toLoginPage")
    public ModelAndView toLoginPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login/login");
        return modelAndView;
    }
}
