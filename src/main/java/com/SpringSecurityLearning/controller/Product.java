package com.SpringSecurityLearning.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Product {
    @GetMapping("/")      // getmapping helps to rout the page where it needs to be open
    public String students(HttpServletRequest request){  // anything coming from session is contained by HttpServletRequest

        return("Hello world"+ request.getSession().getId());
    }

    private record Products(Integer id, String name, String price) {}

    private final List<Products> products = List.of(
            new Products(1, "iPhone", "89,000"),
            new Products(2, "iPad", "8,000"),
            new Products(3, "MacBook", "1,20,000")
    );

    @GetMapping("/product")
    public List<Products> getAllProducts() {
        return products;
    }
}
