package com.product.service.service.impl;

import com.product.service.dto.ProductDto;
import com.product.service.entity.ProductEntity;
import com.product.service.repository.ProductRepository;
import com.product.service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> findAllByCategoryId(Integer categoryId) {

        List<ProductDto> dtoList = new ArrayList<>();
        List<ProductEntity> products = productRepository.findAllByCategoryId(categoryId);
        if(products != null){
            products.forEach(product -> {
                dtoList.add(new ProductDto(product));
            });
        }
        return dtoList;
    }

    @Override
    public ProductDto findByCode(String code) {
        ProductEntity product = productRepository.findByCode(code);
        if(product != null)
            return new ProductDto(product);
        return null;
    }

    @Override
    public void sendMessage() {
        System.out.println("Quartz running success...");
    }
}
