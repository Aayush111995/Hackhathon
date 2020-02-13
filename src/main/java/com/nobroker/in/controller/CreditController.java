package com.nobroker.in.controller;

import com.nobroker.in.entity.CreditActivityEntity;
import com.nobroker.in.entity.RedeeemActivityEntity;
import com.nobroker.in.model.Credit;
import com.nobroker.in.repository.CreditRepository;
import com.nobroker.in.repository.RedeemRepository;
import com.nobroker.in.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CreditController {
    @Autowired
    private CreditService creditRepository;

    @RequestMapping(value = "/credit/update",method = RequestMethod.POST)
    public ResponseEntity<CreditActivityEntity> updateCreditDataById(@RequestBody Credit credit){
        CreditActivityEntity creditActivityEntity=creditRepository.getbyId(String.valueOf(credit.getId()));
        creditActivityEntity.setRefAmount(credit.getRefAmount());
        creditActivityEntity.setReferalAmount(credit.getReferalAmount());
            creditRepository.save(creditActivityEntity);
        return new ResponseEntity<>(creditActivityEntity, HttpStatus.OK);
    }
    @RequestMapping(value = "/credit/all",method = RequestMethod.GET)
    public ResponseEntity getAllCreditData(){ ;
        return new ResponseEntity(creditRepository.getAll(), HttpStatus.OK);
    }
}
