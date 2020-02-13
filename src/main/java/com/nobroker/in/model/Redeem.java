package com.nobroker.in.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Redeem {

    private int id;


    private String activityName;


    private String amount;

}
