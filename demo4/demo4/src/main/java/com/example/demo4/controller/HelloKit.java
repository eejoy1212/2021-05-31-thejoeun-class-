package com.example.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloKit {
    @GetMapping("info")
    public String aaa(Model model, HttpServletRequest request){
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        model.addAttribute("name",name);
        model.addAttribute("phone",phone);

        //model.addAttribute("user","leewonhee");
        //model.addAttribute("phone","010-7777-9999");
        return "hello";
    }

    @GetMapping("in")
    public String input()
    {
        return "input";
    }
}
