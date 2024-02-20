package com.example.springboot.entities;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;

@Entity

public class Patient {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
	@NonNull
	@Size(min = 3, max = 15)
    private String name;
	@DecimalMin("3")
    private int score;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dateNaissance;
    private boolean malade;

}
