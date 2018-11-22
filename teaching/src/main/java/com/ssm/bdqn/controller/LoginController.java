package com.ssm.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("toLogin")
    public static String toLogin(){
        return "index";
    }
}
