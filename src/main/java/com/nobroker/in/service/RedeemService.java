package com.nobroker.in.service;


import com.nobroker.in.entity.CreditActivityEntity;
import com.nobroker.in.entity.RedeeemActivityEntity;
import com.nobroker.in.repository.RedeemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RedeemService {

    @Autowired
    private RedeemRepository redeemRepository;

    public RedeeemActivityEntity getById(String id) {
        return redeemRepository.findById(id).get();
    }

    public List<RedeeemActivityEntity> getAll(){
        return (List<RedeeemActivityEntity>) redeemRepository.findAll();
    }
    public void save(RedeeemActivityEntity redeeemActivityEntity){
        redeemRepository.save(redeeemActivityEntity);
    }
}
