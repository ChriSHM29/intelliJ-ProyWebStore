package com.example.WebStoreAC.Entidades;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Productos")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="Id_Producto")
    private Long idProducto;

    @Column(name="Nombre_Producto",nullable = false)
    private String nombreProducto;

    @Column(name="Descripcion")
    private String descripcionProducto;

    @Column(nullable = false)
    private Double precio;

    @Column(nullable = false)
    private Integer stock;
}
