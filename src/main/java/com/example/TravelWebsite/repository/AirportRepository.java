package com.example.TravelWebsite.repository;

import com.example.TravelWebsite.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface AirportRepository extends JpaRepository<Airport,Long> {
}
