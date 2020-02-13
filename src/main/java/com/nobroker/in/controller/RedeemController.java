package com.nobroker.in.controller;

import com.nobroker.in.entity.RedeeemActivityEntity;
import com.nobroker.in.model.Redeem;
import com.nobroker.in.repository.RedeemRepository;
import com.nobroker.in.service.RedeemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Optional;

@RestController
public class RedeemController {
    @Autowired
    private RedeemService redeemRepository;

    @RequestMapping(name = "/redeem/update",method = RequestMethod.POST)
    public ResponseEntity< RedeeemActivityEntity> updateRedeemDataById(@RequestBody Redeem redeem){
        RedeeemActivityEntity redeeemActivityEntity=redeemRepository.getById(String.valueOf(redeem.getId()));
            redeeemActivityEntity.setAmount(redeem.getAmount());
            redeemRepository.save(redeeemActivityEntity);
        return new ResponseEntity<>(redeeemActivityEntity, HttpStatus.OK);
    }
    @RequestMapping(value = "/redeem/all",method = RequestMethod.GET)
    public ResponseEntity getAllRedeemData(){

        return new ResponseEntity<>(redeemRepository.getAll(), HttpStatus.OK);
    }
}
