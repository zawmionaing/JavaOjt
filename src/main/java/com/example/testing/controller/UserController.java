package com.example.testing.controller;

import com.example.testing.modal.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {


    @RequestMapping("/")
    public String index() {
        return "get_data";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute User user) {

        String str1="git testing string";
        String str2="git testing string";
        String str3="git testing string";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("data_show");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
