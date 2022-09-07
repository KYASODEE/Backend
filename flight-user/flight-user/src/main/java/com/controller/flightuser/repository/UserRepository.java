package com.controller.flightuser.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.controller.flightuser.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

}
