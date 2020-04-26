package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/check")
public class CheckController {
    @RequestMapping("/list")
    public ModelAndView createList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("purchase");
        return modelAndView;

    }
}
