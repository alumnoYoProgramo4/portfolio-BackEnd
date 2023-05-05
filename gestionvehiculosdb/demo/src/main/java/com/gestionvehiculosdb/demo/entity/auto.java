package com.gestionvehiculosdb.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity
@Table(name = "tbl_auto")
public class auto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_auto;
    
    private String marca;
}
