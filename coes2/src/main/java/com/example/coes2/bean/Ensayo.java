package com.example.coes2.bean;

import java.time.LocalDate;

public class Ensayo {
    Long ID_ENSAYO;
    String ESTADO_ENSAYO;
    LocalDate FECHA_PROGRAMADA;
    String COMENTARIO;
    LocalDate FECHA_FIN;
    Long ID_TRABAJADOR;
    Long ID_SOLICITUD;

    public Long getID_ENSAYO() {
        return ID_ENSAYO;
    }

    public void setID_ENSAYO(Long iD_ENSAYO) {
        ID_ENSAYO = iD_ENSAYO;
    }

    public String getESTADO_ENSAYO() {
        return ESTADO_ENSAYO;
    }

    public void setESTADO_ENSAYO(String eSTADO_ENSAYO) {
        ESTADO_ENSAYO = eSTADO_ENSAYO;
    }

    public LocalDate getFECHA_PROGRAMADA() {
        return FECHA_PROGRAMADA;
    }

    public void setFECHA_PROGRAMADA(LocalDate fECHA_PROGRAMADA) {
        FECHA_PROGRAMADA = fECHA_PROGRAMADA;
    }

    public String getCOMENTARIO() {
        return COMENTARIO;
    }

    public void setCOMENTARIO(String cOMENTARIO) {
        COMENTARIO = cOMENTARIO;
    }

    public LocalDate getFECHA_FIN() {
        return FECHA_FIN;
    }

    public void setFECHA_FIN(LocalDate fECHA_FIN) {
        FECHA_FIN = fECHA_FIN;
    }

    public Long getID_TRABAJADOR() {
        return ID_TRABAJADOR;
    }

    public void setID_TRABAJADOR(Long iD_TRABAJADOR) {
        ID_TRABAJADOR = iD_TRABAJADOR;
    }

    public Long getID_SOLICITUD() {
        return ID_SOLICITUD;
    }

    public void setID_SOLICITUD(Long iD_SOLICITUD) {
        ID_SOLICITUD = iD_SOLICITUD;
    }
}
