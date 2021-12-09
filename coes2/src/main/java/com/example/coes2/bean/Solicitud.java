package com.example.coes2.bean;

import java.time.LocalDate;

public class Solicitud {
    Long ID_SOLICITUD;
    LocalDate FECHA_EMISION;
    LocalDate FECHA_TENTATIVA;
    String COMENTARIO;
    String ESTADO;
    Long ID_EMPRESA;
    Long ID_EQUIPO;
    Long ID_CENTRAL;

    public Long getID_SOLICITUD() {
        return ID_SOLICITUD;
    }

    public void setID_SOLICITUD(Long iD_SOLICITUD) {
        ID_SOLICITUD = iD_SOLICITUD;
    }

    public LocalDate getFECHA_EMISION() {
        return FECHA_EMISION;
    }

    public void setFECHA_EMISION(LocalDate fECHA_EMISION) {
        FECHA_EMISION = fECHA_EMISION;
    }

    public LocalDate getFECHA_TENTATIVA() {
        return FECHA_TENTATIVA;
    }

    public void setFECHA_TENTATIVA(LocalDate fECHA_TENTATIVA) {
        FECHA_TENTATIVA = fECHA_TENTATIVA;
    }

    public String getCOMENTARIO() {
        return COMENTARIO;
    }

    public void setCOMENTARIO(String cOMENTARIO) {
        COMENTARIO = cOMENTARIO;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String eSTADO) {
        ESTADO = eSTADO;
    }

    public Long getID_EMPRESA() {
        return ID_EMPRESA;
    }

    public void setID_EMPRESA(Long iD_EMPRESA) {
        ID_EMPRESA = iD_EMPRESA;
    }

    public Long getID_EQUIPO() {
        return ID_EQUIPO;
    }

    public void setID_EQUIPO(Long iD_EQUIPO) {
        ID_EQUIPO = iD_EQUIPO;
    }

    public Long getID_CENTRAL() {
        return ID_CENTRAL;
    }

    public void setID_CENTRAL(Long iD_CENTRAL) {
        ID_CENTRAL = iD_CENTRAL;
    }
}
