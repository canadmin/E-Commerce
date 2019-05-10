package com.ecommerce.Ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class IndexController {


    @RequestMapping({"/index","/"})
    public String index() {
        return "index";
    }
}
