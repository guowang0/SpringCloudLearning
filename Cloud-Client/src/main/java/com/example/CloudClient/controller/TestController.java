package com.example.CloudClient.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by zk on 2017/10/9.
 */

@Controller
public class TestController {

    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;

    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("test","3243234234");
        return modelAndView;
    }

    @RequestMapping("/receive")
    public ModelAndView receive(){
        ModelAndView modelAndView = new ModelAndView("/receive");
        return modelAndView;
    }



//    @MessageMapping("/change-notice")
//    public void greeting(String value){
//        this.simpMessagingTemplate.convertAndSend("/topic/notice", value);
//    }


    @MessageMapping("/change-notice")
    @SendTo("/topic/notice")
    public String greeting(String value) {
        return value;
    }
}
