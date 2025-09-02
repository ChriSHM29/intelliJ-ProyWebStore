package com.example.WebStoreAC.Entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Pagos")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Pago")
    private Integer idPago;

    private double monto;

    @OneToOne
    @JoinColumn(name = "idPedido")
    private Pedido pedido;

@ManyToOne
@JoinColumn(name = "idMetodoPago")
private MetodoPago metodoPago;
    //for verifying

    private Integer idPedido;
    private Integer idMetodoPago;

    private Boolean estadoPago;
}
