package com.nobroker.in.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "credit_activity")
@Data
public class Credit {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "activity_name")
    private String activityName;

    @Column(name = "ref_amount")
    private String refAmount;

    @Column(name = "referal_amount")
    private String referalAmount;

}
