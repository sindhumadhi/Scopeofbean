package com.vehicles.carrepo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vehicles.Car;

public interface CarRepositary extends JpaRepository<Car,Integer>
{

}
