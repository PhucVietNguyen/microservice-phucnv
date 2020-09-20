package com.report.service.service;

import com.report.service.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {

    List<ProductDto> getProductListByCategory(Integer categoryId);
}
