package com.nobroker.in.repository;

import com.nobroker.in.entity.CreditActivityEntity;
import com.nobroker.in.entity.RedeeemActivityEntity;
import org.springframework.data.repository.CrudRepository;

public interface RedeemRepository extends CrudRepository<RedeeemActivityEntity, String> {
}
