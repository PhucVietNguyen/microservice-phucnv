package com.mor.service.oauth.service.impl;

import com.mor.service.oauth.dto.UserDto;
import com.mor.service.oauth.models.UserEntity;
import com.mor.service.oauth.repository.UserRepository;
import com.mor.service.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto findByUsername(String username) {
        UserEntity user = userRepository.findByUsername(username);
        if(user == null)
            throw new NullPointerException("username: " + username + " not found!!!");
        Set<String> roles = new HashSet<>();
        if(!CollectionUtils.isEmpty(user.getRoles())){
            user.getRoles().forEach(item -> roles.add(item.getName()));
        }
        return new UserDto(username, roles);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username);
        if(user == null)
            throw new BadCredentialsException("Bad credentials");
        new AccountStatusUserDetailsChecker().check(user);
        return user;
    }
}
