package com.nobroker.in.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
@Data
public class UserEntity {

    @Column
    @Id
    private int id;
}
