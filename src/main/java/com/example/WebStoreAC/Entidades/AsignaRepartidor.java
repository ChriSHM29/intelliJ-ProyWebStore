package com.example.WebStoreAC.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table(name="Asignacion de Repartidor")
public class AsignaRepartidor {
    private Long idAsignacion;
    private Integer idPedido;
    private Integer idRepartidor;
    private Boolean estadoEntrega;
    private Date fechaEntrega;
    private Date fechaAsignacion;
}
