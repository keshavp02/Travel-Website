package com.example.TravelWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TravelWebsite.entity.VacationPackage;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationPackageRepository extends JpaRepository<VacationPackage,Long> {
    
}
