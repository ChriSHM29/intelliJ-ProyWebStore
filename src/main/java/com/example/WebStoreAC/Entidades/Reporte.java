package com.example.WebStoreAC.Entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="Reportes")
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reporte")
    private Long idReporte;

    @JoinColumn(name="id_admin",nullable = false)
    private Integer idAdmin;
    private String Tipo;
    private Date fecha;

    @Column(name = "Descripcion_Reporte")
    private String descripcionReporte;
}
