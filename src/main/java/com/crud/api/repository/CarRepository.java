package com.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
