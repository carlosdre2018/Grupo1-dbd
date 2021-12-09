package com.example.coes.bean;

public class Trabajador {
    Long ID_TRABAJADOR;
    String DISPONIBILIDAD;
    Long TELEFONO;
    String APELLIDO_PATERNO;
    String APELLIDO_MATERNO;
    String NOMBRES;
    Long ID_USUARIO;

    public Long getID_TRABAJADOR() {
        return ID_TRABAJADOR;
    }

    public void setID_TRABAJADOR(Long iD_TRABAJADOR) {
        ID_TRABAJADOR = iD_TRABAJADOR;
    }

    public String getDISPONIBILIDAD() {
        return DISPONIBILIDAD;
    }

    public void setDISPONIBILIDAD(String dISPONIBILIDAD) {
        DISPONIBILIDAD = dISPONIBILIDAD;
    }

    public Long getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(Long tELEFONO) {
        TELEFONO = tELEFONO;
    }

    public String getAPELLIDO_PATERNO() {
        return APELLIDO_PATERNO;
    }

    public void setAPELLIDO_PATERNO(String aPELLIDO_PATERNO) {
        APELLIDO_PATERNO = aPELLIDO_PATERNO;
    }

    public String getAPELLIDO_MATERNO() {
        return APELLIDO_MATERNO;
    }

    public void setAPELLIDO_MATERNO(String aPELLIDO_MATERNO) {
        APELLIDO_MATERNO = aPELLIDO_MATERNO;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String nOMBRES) {
        NOMBRES = nOMBRES;
    }

    public Long getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(Long iD_USUARIO) {
        ID_USUARIO = iD_USUARIO;
    }

}
