package com.sb.springbootdemo1.controller;

import com.sb.springbootdemo1.entity.Products;
import com.sb.springbootdemo1.service.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProductsController {











    @Resource
    ProductsService productsService;
    @RequestMapping("productsList")
    public Object productsList(int pid){
        ModelAndView mav = new ModelAndView();
        mav.addObject("Products",productsService.queryProducts(pid));
        mav.setViewName("index");
        return mav;
    }
}
