package com.gestionvehiculosdb.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_vehiculo")
public class vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id_vehiculo;

    private Integer modelo;
    
    private String patente;

    private String chasis;

    private String  motor;


}
