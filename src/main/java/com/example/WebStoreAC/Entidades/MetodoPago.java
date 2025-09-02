package com.example.WebStoreAC.Entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Metodo_Pago")
public class MetodoPago {
    private Long idMetodoPago;
    private String nombre;
    private String Tipo;
}
