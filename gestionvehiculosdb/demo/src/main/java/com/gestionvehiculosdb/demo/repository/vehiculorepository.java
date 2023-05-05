package com.gestionvehiculosdb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionvehiculosdb.demo.entity.vehiculo;

@Repository
public interface vehiculorepository extends JpaRepository<vehiculo,Integer> {
    
}
