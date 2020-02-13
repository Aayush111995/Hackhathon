package com.nobroker.in.repository;

import com.nobroker.in.entity.Redeem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedeemRepository extends CrudRepository<Redeem, String> {
}
