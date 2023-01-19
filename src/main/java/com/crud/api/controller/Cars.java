package com.crud.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.api.dto.CarsDto;
import com.crud.api.model.Car;
import com.crud.api.repository.CarRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cars")
public class Cars {

    @Autowired
    private CarRepository repository;

    @PostMapping
    public void addCars(@RequestBody @Valid CarsDto req) {
        repository.save(new Car(req));
    }

}
