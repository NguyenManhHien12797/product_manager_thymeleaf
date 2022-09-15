package com.example.product_manager_thymeleaf.controller;

import com.example.product_manager_thymeleaf.model.Product;
import com.example.product_manager_thymeleaf.service.product.IProductService;
import com.example.product_manager_thymeleaf.service.product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final IProductService productService = new ProductService();

    @GetMapping("")
    public String index(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("products",productList);
        return "/index";
    }
}
