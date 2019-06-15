package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 陈斌
 * @Description
 * @date 2019/5/23 21:45
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
