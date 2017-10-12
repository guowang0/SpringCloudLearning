package com.example.CloudClient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zk on 2017/10/9.
 */

@Controller
public class TestController {

    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("test","3243234234");
        return modelAndView;
    }
}
