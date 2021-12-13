package com.example.coes2.bean;

import java.time.LocalDate;

public class Solicitud {
    Long id_solicitud;
    LocalDate fecha_emision;
    LocalDate fecha_tentativa;
    String comentario;
    String estado;
    Long id_empresa;
    Long id_equipo;
    Long id_central;

    public Long getID_SOLICITUD() {
        return id_solicitud;
    }

    public void setID_SOLICITUD(Long iD_SOLICITUD) {
        id_solicitud = iD_SOLICITUD;
    }

    public LocalDate getFECHA_EMISION() {
        return fecha_emision;
    }

    public void setFECHA_EMISION(LocalDate fECHA_EMISION) {
        fecha_emision = fECHA_EMISION;
    }

    public LocalDate getFECHA_TENTATIVA() {
        return fecha_tentativa;
    }

    public void setFECHA_TENTATIVA(LocalDate fECHA_TENTATIVA) {
        fecha_tentativa = fECHA_TENTATIVA;
    }

    public String getCOMENTARIO() {
        return comentario;
    }

    public void setCOMENTARIO(String cOMENTARIO) {
        comentario = cOMENTARIO;
    }

    public String getESTADO() {
        return estado;
    }

    public void setESTADO(String eSTADO) {
        estado = eSTADO;
    }

    public Long getID_EMPRESA() {
        return id_empresa;
    }

    public void setID_EMPRESA(Long iD_EMPRESA) {
        id_empresa = iD_EMPRESA;
    }

    public Long getID_EQUIPO() {
        return id_equipo;
    }

    public void setID_EQUIPO(Long iD_EQUIPO) {
        id_equipo = iD_EQUIPO;
    }

    public Long getID_CENTRAL() {
        return id_central;
    }

    public void setID_CENTRAL(Long iD_CENTRAL) {
        id_central = iD_CENTRAL;
    }
}
