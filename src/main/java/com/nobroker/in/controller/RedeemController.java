package com.nobroker.in.controller;

import com.nobroker.in.entity.Credit;
import com.nobroker.in.entity.Redeem;
import com.nobroker.in.service.RedeemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/redeem")
public class RedeemController {
    @Autowired
    private RedeemService redeemService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Redeem> getAllRedeemData(){
    List<Redeem> allRedeem = redeemService.getAll();
        return allRedeem;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public Redeem deleteRedeem(@RequestParam String id){
        Redeem redeem = redeemService.deleteRedeem(id);
        return redeem;
    }

    @CrossOrigin
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Redeem addNewRedeem(@RequestParam String activity,
                               @RequestParam String amount){
        Redeem redeem = redeemService.addNewRedeem(activity, amount);
        return redeem;
    }
}
