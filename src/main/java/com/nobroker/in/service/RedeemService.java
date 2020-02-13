package com.nobroker.in.service;


import com.nobroker.in.entity.RedeeemActivityEntity;
import com.nobroker.in.repository.RedeemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RedeemService {

    @Autowired
    private RedeemRepository redeemRepository;

    public Optional<RedeeemActivityEntity> getById(String id) {
        return redeemRepository.findById(id);
    }
}
