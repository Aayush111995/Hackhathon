package com.nobroker.in.repository;

import com.nobroker.in.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,String> {


}
