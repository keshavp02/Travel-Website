package com.example.TravelWebsite.controller;

import com.example.TravelWebsite.entity.Airport;
import com.example.TravelWebsite.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api")
public class AirportController {

    @Autowired
    AirportRepository airportRepository;
    @PostMapping("/Add")
    public ResponseEntity<?> AddAirport(@RequestBody Airport airport)
    {
        airportRepository.save(airport);
        return ResponseEntity.ok("Done adding a single airport");
    }
    @GetMapping(value ="/test")
    public ResponseEntity<?> test()
    {
        return ResponseEntity.ok("Test");
    }
    @GetMapping(value ="/all")
    public ResponseEntity<?> getAllAirports()
    {
       return  ResponseEntity.ok(airportRepository.findAll());
    }


}
