package com.example.coes2.bean;

import java.math.BigDecimal;

public class Equipo {
    Long ID_EQUIPO;
    String NOMBRE;
    BigDecimal POTENCIA_FABRICANTE;
    String TIPO_EQUIPO;
    BigDecimal POTENCIA_ACTUAL;
    Long ID_EMPRESA;

    public Long getID_EQUIPO() {
        return ID_EQUIPO;
    }

    public void setID_EQUIPO(Long iD_EQUIPO) {
        ID_EQUIPO = iD_EQUIPO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String nOMBRE) {
        NOMBRE = nOMBRE;
    }

    public BigDecimal getPOTENCIA_FABRICANTE() {
        return POTENCIA_FABRICANTE;
    }

    public void setPOTENCIA_FABRICANTE(BigDecimal pOTENCIA_FABRICANTE) {
        POTENCIA_FABRICANTE = pOTENCIA_FABRICANTE;
    }

    public String getTIPO_EQUIPO() {
        return TIPO_EQUIPO;
    }

    public void setTIPO_EQUIPO(String tIPO_EQUIPO) {
        TIPO_EQUIPO = tIPO_EQUIPO;
    }

    public BigDecimal getPOTENCIA_ACTUAL() {
        return POTENCIA_ACTUAL;
    }

    public void setPOTENCIA_ACTUAL(BigDecimal pOTENCIA_ACTUAL) {
        POTENCIA_ACTUAL = pOTENCIA_ACTUAL;
    }

    public Long getID_EMPRESA() {
        return ID_EMPRESA;
    }

    public void setID_EMPRESA(Long iD_EMPRESA) {
        ID_EMPRESA = iD_EMPRESA;
    }
}
