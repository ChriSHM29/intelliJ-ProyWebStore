package com.example.WebStoreAC.Run;

import com.example.WebStoreAC.Entidades.Usuario;
import com.example.WebStoreAC.Repositorio.RepositorioUsuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CargaInicial {

    @Bean
    CommandLineRunner initUsuarios(RepositorioUsuario repo) {
        return args -> {
            Usuario u = new Usuario();
            u.setNombreUsuario("Chris");
            u.setContrasena("12345");
            u.setTelefono("987654321");
            u.setEmail("chris@mail.com");
            u.setFechaRegistro(LocalDate.now());
            // OJO: también debes setear un Rol válido aquí
            repo.save(u);

            System.out.println(" Usuario guardado: " + u);
        };
    }
}