package com.example.WebStoreAC.Entidades;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="Detalle_Pedido")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetallePedido;

@ManyToOne
@JoinColumn(name = "id_pedido",nullable = false)
    private Pedido pedido;

@Column(name = "id_Producto")
    private Producto producto;
    private Integer cantidad;
    private Double subtotal;
}
