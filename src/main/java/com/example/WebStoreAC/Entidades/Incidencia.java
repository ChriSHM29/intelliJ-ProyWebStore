package com.example.WebStoreAC.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table (name = "Incidencia")
public class Incidencia {
    private Integer id_incidencia;


@ManyToOne
@JoinColumn(name="idPedido")
    private Pedido pedido;


//this part is for later (need to verify)
    private Date fecha;
    private String descripcion;

    private Integer id_usuario_soporte;
    private Integer id_usuario_cliente;

}
