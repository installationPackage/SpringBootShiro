package com.ssm.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {
    @RequestMapping("toLogin")
    public String toLogin(){
        return "navigation";
    }
}
