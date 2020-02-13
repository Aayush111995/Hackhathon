package com.nobroker.in.controller;

import com.nobroker.in.entity.UserEntity;
import com.nobroker.in.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class TestController {
    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void x(){
        UserEntity userEntity=new UserEntity();
        userEntity.setId(2);
        userRepository.save(userEntity);
    }
}
