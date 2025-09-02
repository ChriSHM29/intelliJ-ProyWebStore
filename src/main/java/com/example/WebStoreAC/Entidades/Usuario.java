package com.example.WebStoreAC.Entidades;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    @Column(name="nombre_usuario",nullable = false)
    private String nombreUsuario;

    @Column(nullable = false)
    private String contrasena;
    private String telefono;

    @Column(nullable = false)
    private String email;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;

}
