package com.report.service.controller;

import com.report.service.dto.ProductDto;
import com.report.service.service.ReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Reported APIs")
public class ReportController {

    @Autowired
    private ReportService reportService;

//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;

    @ApiOperation(value = "Lấy danh sách product từ product-service để xuất báo cáo", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Thành công"),
            @ApiResponse(code = 401, message = "Chưa xác thực"),
            @ApiResponse(code = 404, message = "Không tìm thấy")
    })
    @GetMapping(value = "/report-product-list/{categoryId}")
    public ResponseEntity<List<ProductDto>> getReportProduct(@PathVariable Integer categoryId){
        List<ProductDto> dtoList = reportService.getProductListByCategory(categoryId);
        return ResponseEntity.ok(dtoList);
    }

//    @PostMapping(value = "/demo-kafka/{meg}")
//    public String demoKafka(@PathVariable String meg){
//        this.sendMessage(meg);
//        return "success";
//    }
//
//    public void sendMessage(String meg){
//        kafkaTemplate.send("demo", meg);
//    }
//
//    @KafkaListener(topics = "demo", groupId = "group-id")
//    public void listen(String msg) {
//        System.out.println("Kafka Message in group - group-id: " + msg);
//    }

}
