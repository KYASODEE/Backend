package com.caseStudy.RRS.controller;
import java.util.Arrays;
import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.caseStudy.RRS.model.Admin;
import com.caseStudy.RRS.repo.AdminRepository;



@RestController
public class AdminController {
    @Autowired
    private AdminRepository repository;

    /*
     * @Autowired private RestTemplate restTemplate;
     */
    @PostMapping("/addFlight")
    public String saveBook(@RequestBody Admin admin) {
        repository.save(admin);
        return "Added Flight with id : " + admin.getFlightid();
    }

    @GetMapping("/getAllFlights")
    public List<Admin> getBooks() {
        return (List<Admin>) repository.findAll();
    }



    @GetMapping("/getAllFlights/{flight_id}")
    public java.util.Optional<Admin> getFlightName(@PathVariable("flight_id") String flight_id) {
        return repository.findById(flight_id);
    }

    @DeleteMapping("/delete/{flight_id}")
    public String deleteFlight (@PathVariable String flight_id) {
        repository.deleteById(flight_id);
        return "Flight deleted with no : "+flight_id;

    }

    @PutMapping("/update/{flight_id}")
    public Admin updateFlight(@PathVariable("flight_id") String flight_id,@RequestBody Admin t ) {
        t.setFlight_no(flight_id);
        repository.save(t);
        return t;
}
}
