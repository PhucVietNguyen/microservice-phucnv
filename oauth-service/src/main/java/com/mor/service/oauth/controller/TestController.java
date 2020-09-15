package com.mor.service.oauth.controller;

import com.mor.service.oauth.dto.UserDto;
import com.mor.service.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/get-user/{username}")
    public ResponseEntity<UserDto> getUserByUsername(@PathVariable String username){
        UserDto dto = userService.findByUsername(username);
        return ResponseEntity.ok(dto);
    }

    @PostMapping(value = "/test")
    public String testApi(){
        return "test";
    }
}
