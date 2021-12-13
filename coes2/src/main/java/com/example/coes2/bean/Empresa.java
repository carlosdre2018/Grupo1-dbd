package com.example.coes2.bean;

import java.time.LocalDate;

public class Empresa {
    Long ID_EMPRESA;
    String RAZON_SOCIAL;
    LocalDate FECHA_RETIRO;
    String NOMBRE;
    String CORREO;
    Long TELEFONO;

    public Long getID_EMPRESA() {
        return ID_EMPRESA;
    }

    public void setID_EMPRESA(Long iD_EMPRESA) {
        ID_EMPRESA = iD_EMPRESA;
    }

    public String getRAZON_SOCIAL() {
        return RAZON_SOCIAL;
    }

    public void setRAZON_SOCIAL(String rAZON_SOCIAL) {
        RAZON_SOCIAL = rAZON_SOCIAL;
    }

    public LocalDate getFECHA_RETIRO() {
        return FECHA_RETIRO;
    }

    public void setFECHA_RETIRO(LocalDate fECHA_RETIRO) {
        FECHA_RETIRO = fECHA_RETIRO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String nOMBRE) {
        NOMBRE = nOMBRE;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String cORREO) {
        CORREO = cORREO;
    }

    public Long getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(Long tELEFONO) {
        TELEFONO = tELEFONO;
    }
}
