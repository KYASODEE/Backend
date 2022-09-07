package com.flightcheckin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flightcheckin.model.CheckInRecord;

public interface CheckInRepo extends MongoRepository<CheckInRecord, Long> {

}
