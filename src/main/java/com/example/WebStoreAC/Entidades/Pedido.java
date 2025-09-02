package com.example.WebStoreAC.Entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name="Pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Pedido")
    private Long idPedido;

    @Column(name="Fecha_Pedido",nullable = false)
    private LocalDate fechaPedido;

    @Column(nullable = false)
    private Boolean estado;

    @Column(nullable = false)
    private BigDecimal total;


    // Relación con cliente (que en realidad es un Usuario con rol Cliente)
@ManyToOne
@JoinColumn(name = "id_cliente",nullable = false)
    private Usuario cliente;


    // Relación con repartidor (que en realidad es un Usuario con rol Repartidor)
@ManyToOne
@JoinColumn(name = "id_repartidor",nullable = false)
private Usuario repartidor;
}
