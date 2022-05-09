package com.app.models;

import lombok.Data;


import javax.persistence.Id;
import java.time.LocalDate;

@Data
public class Empleaddo {
    @Id
    private String _id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String telefono;

    private String correo;
    private String usuario; // Como en el usuario ya no se repite este campo no es necesario volverlo a indexar
    private String genero;
    private boolean esControlador;
}
