package com.example.TravelWebsite.controller;

import com.example.TravelWebsite.entity.Airport;
import com.example.TravelWebsite.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("airports")
public class AirportController {

    @Autowired
    AirportRepository airportRepository;
    @PostMapping("/add")
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
    @CrossOrigin
    public ResponseEntity<?> getAllAirports()
    {
       return  ResponseEntity.ok(airportRepository.findAll());
    }


}
