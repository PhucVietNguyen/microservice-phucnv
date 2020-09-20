package com.product.service.service;

import com.product.service.dto.ProductDto;
import com.product.service.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<ProductDto> findAllByCategoryId(Integer categoryId);
    ProductDto findByCode(String code);
}
