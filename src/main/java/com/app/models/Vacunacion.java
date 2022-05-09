package com.app.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;



public class Vacunacion {
    @Id
    private String _id;

    private String centroVacunacion;

    private String estudiante;
    private String nombreVacuna;
    private LocalDate fechaPrimeraDosis;
    private LocalDate fechaSegundasDosis;
    private String vacunadorPrimeraDosis;
    private String vacunadorSegundaDosis;
    private boolean primeraDosis;
    private boolean segundaDosis;
    private String loteDosisUno;
    private String loteDosisDos;
    private boolean inoculacionVoluntaria;
}
