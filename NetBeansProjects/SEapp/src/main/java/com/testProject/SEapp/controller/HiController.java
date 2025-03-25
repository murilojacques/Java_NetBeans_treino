package com.testProject.SEapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HiController {
	
    @GetMapping("/index")
    public ModelAndView pagIndex() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
