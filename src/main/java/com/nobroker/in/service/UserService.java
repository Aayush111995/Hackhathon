package com.nobroker.in.service;


import com.nobroker.in.entity.UserEntity;
import com.nobroker.in.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<UserEntity> getById(String id) {
        return userRepository.findById(id);
    }
}
