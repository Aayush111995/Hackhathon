package com.nobroker.in.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Credit {

    private int id;


    private String activityName;


    private String refAmount;

    private String referalAmount;
}
