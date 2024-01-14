package com.example.TravelWebsite.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "VacationPackage")
@Entity
public class VacationPackage {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private Date date;

    public VacationPackage() {
        // Default constructor required by JPA
    }

    public VacationPackage(Long id, String name, String description, Date date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
