package com.example.TravelWebsite.controller;

import com.example.TravelWebsite.model.Airport;
import com.example.TravelWebsite.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api")
public class AirportController {

    @Autowired
    AirportRepository airportRepository;
    @GetMapping(value ="/Add/{airport}")
    public ResponseEntity<?> AddAirport(@RequestHeader Airport airport)
    {
        airportRepository.save(airport);
        return ResponseEntity.ok("Done adding a single airport");
    }
    @GetMapping(value ="/test")
    public ResponseEntity<?> test()
    {
        return ResponseEntity.ok("Test");
    }
}
