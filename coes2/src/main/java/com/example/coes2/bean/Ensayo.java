package com.example.coes2.bean;

import java.time.LocalDate;

public class Ensayo {
    Long id_ensayo;
    String estado_ensayo;
    LocalDate fecha_programada;
    String comentario;
    LocalDate fecha_fin;
    Long id_trabajador;
    Long id_solicitud;

    public Long getID_ENSAYO() {
        return id_ensayo;
    }

    public void setID_ENSAYO(Long iD_ENSAYO) {
        id_ensayo = iD_ENSAYO;
    }

    public String getESTADO_ENSAYO() {
        return estado_ensayo;
    }

    public void setESTADO_ENSAYO(String eSTADO_ENSAYO) {
        estado_ensayo = eSTADO_ENSAYO;
    }

    public LocalDate getFECHA_PROGRAMADA() {
        return fecha_programada;
    }

    public void setFECHA_PROGRAMADA(LocalDate fECHA_PROGRAMADA) {
        fecha_programada = fECHA_PROGRAMADA;
    }

    public String getCOMENTARIO() {
        return comentario;
    }

    public void setCOMENTARIO(String cOMENTARIO) {
        comentario = cOMENTARIO;
    }

    public LocalDate getFECHA_FIN() {
        return fecha_fin;
    }

    public void setFECHA_FIN(LocalDate fECHA_FIN) {
        fecha_fin = fECHA_FIN;
    }

    public Long getID_TRABAJADOR() {
        return id_trabajador;
    }

    public void setID_TRABAJADOR(Long iD_TRABAJADOR) {
        id_trabajador = iD_TRABAJADOR;
    }

    public Long getID_SOLICITUD() {
        return id_solicitud;
    }

    public void setID_SOLICITUD(Long iD_SOLICITUD) {
        id_solicitud = iD_SOLICITUD;
    }
}
