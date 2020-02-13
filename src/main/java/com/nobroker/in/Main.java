package com.nobroker.in;


import com.nobroker.in.entity.UserEntity;
import com.nobroker.in.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        //logger.info("application started");

        SpringApplication.run(Main.class, args);
    }
}
