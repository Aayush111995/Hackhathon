package com.nobroker.in.service;

import com.nobroker.in.entity.CreditActivityEntity;
import com.nobroker.in.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditService {

    @Autowired
    private CreditRepository creditRepository;

    public CreditActivityEntity getbyId(String id) {
        return creditRepository.findById(id).get();
    }

    public List<CreditActivityEntity> getAll(){
        return (List<CreditActivityEntity>) creditRepository.findAll();
    }
    public void save(CreditActivityEntity creditActivityEntity){
         creditRepository.save(creditActivityEntity);
    }
}
