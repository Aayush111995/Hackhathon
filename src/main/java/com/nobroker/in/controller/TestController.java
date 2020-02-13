package com.nobroker.in.controller;

import com.nobroker.in.entity.UserEntity;
import com.nobroker.in.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class TestController {
    @Autowired
    UserRepository userRepository;

    //@RequestMapping(name = "/",method = RequestMethod.POST)
    public void x(){
        UserEntity userEntity=new UserEntity();
        userEntity.setId(2);
        userRepository.save(userEntity);
        System.out.println("enter");
    }
}
