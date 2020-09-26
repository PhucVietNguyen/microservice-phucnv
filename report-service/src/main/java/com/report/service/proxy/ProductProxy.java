package com.report.service.proxy;

import com.report.service.config.ProductClientConfiguration;
import com.report.service.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service", url = "localhost:8200", configuration = ProductClientConfiguration.class)
public interface ProductProxy {

    @GetMapping(value = "/product/api/product-list/{categoryId}")
    List<ProductDto> getAllProductByCategoryId(@PathVariable Integer categoryId);
}
