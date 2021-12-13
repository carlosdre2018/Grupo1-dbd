package com.example.coes2.bean;

import java.time.LocalDate;

public class Usuario {
    Long ID_USUARIO;
    String CONTRASENA;
    LocalDate FECHA_INGRESO;
    String TIPO_USUARIO;
    String DIRECCION;

    public Long getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(Long iD_USUARIO) {
        ID_USUARIO = iD_USUARIO;
    }

    public String getCONTRASENA() {
        return CONTRASENA;
    }

    public void setCONTRASENA(String cONTRASENA) {
        CONTRASENA = cONTRASENA;
    }

    public LocalDate getFECHA_INGRESO() {
        return FECHA_INGRESO;
    }

    public void setFECHA_INGRESO(LocalDate fECHA_INGRESO) {
        FECHA_INGRESO = fECHA_INGRESO;
    }

    public String getTIPO_USUARIO() {
        return TIPO_USUARIO;
    }

    public void setTIPO_USUARIO(String tIPO_USUARIO) {
        TIPO_USUARIO = tIPO_USUARIO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String dIRECCION) {
        DIRECCION = dIRECCION;
    }

}
