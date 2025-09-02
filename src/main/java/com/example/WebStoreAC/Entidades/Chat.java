package com.example.WebStoreAC.Entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "chat")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chat")
    private Long idChat;

@ManyToOne
    private Pedido pedido;

@OneToMany
private List<Mensaje> mensajes;

    //this part is for verifying
    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    private Integer id_usuario_cliente;
    private Integer id_usuario_soporte;
}
