package com.product.service.controller;

import com.product.service.dto.ProductDto;
import com.product.service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/product-list/{categoryId}")
    public List<ProductDto> getAllProductByCategoryId(@PathVariable Integer categoryId){
        List<ProductDto> dtoList = productService.findAllByCategoryId(categoryId);
        return dtoList;
    }

    @GetMapping(value = "/product/{code}")
    public ProductDto getProductById(@PathVariable String code){
        ProductDto dto = productService.findByCode(code);
        return dto;
    }

    @PostMapping(value = "/not-use-auth")
    public String demoAuth(){
        return "not use auth";
    }
}
