package com.app.models;

import lombok.Data;

import javax.persistence.Id;
import java.util.List;


@Data
public class Usuario {
    @Id
    private String _id;

    private String nombreUsuario;
    private String contrasena;
    private List<String> roles;
}
