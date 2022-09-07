package com.flightcheckin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.flightcheckin.model.CheckInRecord;
import com.flightcheckin.repository.CheckInRepo;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/checkin")
public class CheckInController {

	@Autowired
	private CheckInRepo checkInRepo;

	
	@GetMapping("/fetchAllFlight")
	public ResponseEntity<?> getFlights() {
		return ResponseEntity.ok(this.checkInRepo.findAll());
	}

	
	@GetMapping("/{id}")
	public Optional<CheckInRecord> getCheckIn(@PathVariable long id) {
		return checkInRepo.findById(id);
	}
	
	
	

	
	@PutMapping("/updatecheckin")
	public ResponseEntity<?> updateCheckInRecord(@RequestBody CheckInRecord updateCheckInRecord) {

		CheckInRecord update = this.checkInRepo.save(updateCheckInRecord);
		return ResponseEntity.ok(update);
	}

}
