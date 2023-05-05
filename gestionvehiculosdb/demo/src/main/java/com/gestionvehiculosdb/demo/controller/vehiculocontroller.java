package com.gestionvehiculosdb.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestionvehiculosdb.demo.entity.vehiculo;
import com.gestionvehiculosdb.demo.services.vehiculoservice;

@RestController
@RequestMapping(value = "/")
public class vehiculocontroller {
    
    @Autowired
    vehiculoservice _vehiculoservice;
     
    public vehiculocontroller(vehiculoservice vehiculoservice) {
        _vehiculoservice = vehiculoservice;
    }

    @GetMapping
    public List<vehiculo> obtenerTodos()
    {
        return _vehiculoservice.obtenerTodos();
    }

    @GetMapping("/{vehiculoId}")
    public Optional<vehiculo> obtenerVehiculoPorId(@PathVariable("vehiculoId") Integer id)
    {
        return _vehiculoservice.obtenerPorId(id);
    }

    @PostMapping("/new/vehiculo")
    public void guardarOActualizarVehiculo(@RequestBody vehiculo obj)
    {
        _vehiculoservice.guardarOActualizar(obj);
    }

    @DeleteMapping("/{vehiculoId}")
    public void eliminarVehiculo(@PathVariable("vehiculoId") Integer id)
    {
        _vehiculoservice.eliminar(id);
    }

}
