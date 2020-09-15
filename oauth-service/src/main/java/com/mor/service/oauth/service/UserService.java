package com.mor.service.oauth.service;

import com.mor.service.oauth.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {

    UserDto findByUsername(String username);
}
