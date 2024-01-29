package com.example.TravelWebsite.controller;

import com.example.TravelWebsite.entity.VacationPackage;
import com.example.TravelWebsite.repository.VacationPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiv1/vp")
public class VacationPackageController {

    @Autowired
    VacationPackageRepository vacationPackageRepository;

    @GetMapping
    public List<VacationPackage> getAllVacationPackages() {
        return vacationPackageRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VacationPackage> getVacationPackageById(@PathVariable Long id) {
        Optional<VacationPackage> optionalPackage = vacationPackageRepository.findById(id);
        return optionalPackage.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/submit")
    public ResponseEntity<?> addVacationPackage(@RequestBody VacationPackage vacationPackage) {
        vacationPackageRepository.save(vacationPackage);
        return ResponseEntity.ok("Done adding a vacation package");
    }

    @PutMapping("/{id}")
    public ResponseEntity<VacationPackage> updateVacationPackage(@PathVariable Long id, @RequestBody VacationPackage updatedPackage) {
        Optional<VacationPackage> optionalPackage = vacationPackageRepository.findById(id);
        if (optionalPackage.isPresent()) {
            VacationPackage existingPackage = optionalPackage.get();
            existingPackage.setName(updatedPackage.getName());
            existingPackage.setDescription(updatedPackage.getDescription());
            existingPackage.setDate(updatedPackage.getDate());

            return ResponseEntity.ok(vacationPackageRepository.save(existingPackage));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVacationPackage(@PathVariable Long id) {
        if (vacationPackageRepository.existsById(id)) {
            vacationPackageRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
