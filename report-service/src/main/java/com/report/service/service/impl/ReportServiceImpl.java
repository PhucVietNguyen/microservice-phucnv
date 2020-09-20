package com.report.service.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.report.service.dto.ProductDto;
import com.report.service.proxy.ProductProxy;
import com.report.service.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ProductProxy productProxy;

    @HystrixCommand(fallbackMethod = "failGetProductList",
    ignoreExceptions = { Exception.class },
    commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000000")
    })
    @Override
    public List<ProductDto> getProductListByCategory(Integer categoryId) {
        return productProxy.getAllProductByCategoryId(categoryId);
    }

    public List<ProductDto> failGetProductList() {
        List<ProductDto> dtoList = new ArrayList<>();
        return dtoList;
    }
}
