package com.nobroker.in.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "credit_activity")
@Data
public class CreditActivityEntity {

    @Id
    @Column
    private int id;

    @Column
    private String activityName;

    @Column
    private String refAmount;

    @Column
    private String referalAmount;

}
