package com.wyb.winter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {

    @RequestMapping("/NavigationHtml")
    public String test() {
        return "Navigation";
    }

    @RequestMapping("/layui")
    public String layui() {
        return "indexHtml";
    }
}
