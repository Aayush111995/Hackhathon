package com.nobroker.in.service;


//import com.nobroker.in.entity.CreditActivityEntity;

import com.nobroker.in.entity.Credit;
import com.nobroker.in.entity.Redeem;
import com.nobroker.in.repository.RedeemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RedeemService {

    @Autowired
    private RedeemRepository redeemRepository;

    public Redeem getById(String id) {
        return redeemRepository.findById(id).get();
    }

    public List<Redeem> getAll(){
        return (List<Redeem>) redeemRepository.findAll();
    }

    public Redeem addNewRedeem(String activity, String amount){
        Redeem redeem = new Redeem();
        redeem.setActivityName(activity);
        String uniqueID = UUID.randomUUID().toString();
        redeem.setId(uniqueID);
        redeem.setAmount(String.valueOf(amount));
        redeemRepository.save(redeem);
        return redeem;
    }

    public Redeem deleteRedeem(String id){
        Redeem redeem = getById(id);
        redeemRepository.delete(redeem);
        return redeem;
    }

    public Redeem updateRedeem(String redeemId, String amount){
        Redeem redeem = getById(redeemId);
        redeem.setAmount(amount);
        redeemRepository.save(redeem);
        return redeem;
    }

}
