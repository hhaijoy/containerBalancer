package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName mainController.java
 * @Author wzh
 * @Version 1.0.0
 * @Description
 * @CreateDate(Y/M/D-H:M:S) 2021/07/16/ 10:14:00
 */
@RestController
public class MainRestController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ModelAndView getHello(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("hello");
        modelAndView.addObject("info","balancer0.9");

        return modelAndView;
    }

}
