package com.codegym.demoorm.controller;

import com.codegym.demoorm.model.Product;
import com.codegym.demoorm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("home");
        List<Product> list = productService.findAll();
        modelAndView.addObject("list",list);
        return modelAndView;
    }
    @GetMapping("/search")
    public ModelAndView showSearch(@RequestParam String nameSearch) {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;


    }
    @PostMapping("/search")
    public ModelAndView searchResult(){
        return null;
    }
}
