package com.nobroker.in.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "redeem_activity")
@Data
public class RedeeemActivityEntity {

    @Id
    @Column
    private int id;

    @Column
    private String activityName;

    @Column
    private String amount;

    
}
