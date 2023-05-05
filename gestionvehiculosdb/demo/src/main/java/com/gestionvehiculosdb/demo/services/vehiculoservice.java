package com.gestionvehiculosdb.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionvehiculosdb.demo.entity.vehiculo;
import com.gestionvehiculosdb.demo.repository.vehiculorepository;

@Service
public class vehiculoservice {

    @Autowired
    vehiculorepository _vehiculorepository;
    
    public List<vehiculo> obtenerTodos()
    {
        return _vehiculorepository.findAll();
    }

    public Optional<vehiculo> obtenerPorId(Integer id)
    {
        return _vehiculorepository.findById(id);
    }

    public void guardarOActualizar(vehiculo obj)
    {
        _vehiculorepository.save(obj);
    }

    public void eliminar(Integer id)
    {
        _vehiculorepository.deleteById(id);
    }

}
