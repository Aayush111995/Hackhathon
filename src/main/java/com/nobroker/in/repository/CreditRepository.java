package com.nobroker.in.repository;

import com.nobroker.in.entity.CreditActivityEntity;
import org.springframework.data.repository.CrudRepository;

public interface CreditRepository extends CrudRepository<CreditActivityEntity, String> {
}
