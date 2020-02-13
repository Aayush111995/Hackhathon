package com.nobroker.in.service;

import com.nobroker.in.entity.Credit;
import com.nobroker.in.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CreditService {

    @Autowired
    private CreditRepository creditRepository;

    public Credit addNewCredit(String activity, String amount){
        Credit credit = new Credit();
        credit.setActivityName(activity);
        credit.setRefAmount(String.valueOf(amount));
        String uniqueID = UUID.randomUUID().toString();
        credit.setId(uniqueID);
        credit.setReferalAmount(String.valueOf(amount));
        creditRepository.save(credit);
        return credit;
    }

    public Credit getbyId(String id) {
        return creditRepository.findById(id).get();
    }

    public Credit updateCredit(String creditId, String amount){
        Credit credit = getbyId(creditId);
        credit.setRefAmount(amount);
        credit.setReferalAmount(amount);
        creditRepository.save(credit);
        return credit;
    }

    public List<Credit> getAll(){
        return (List<Credit>) creditRepository.findAll();
    }

    public Credit deleteCredit(String id){
        Credit credit = getbyId(id);
        creditRepository.delete(credit);
        return credit;
    }

}
