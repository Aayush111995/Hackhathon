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

    @Column(name = "activity_name")
    private String activityName;

    @Column(name = "amount")
    private String amount;

    
}
