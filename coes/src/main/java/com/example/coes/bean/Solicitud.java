package com.example.coes.bean;
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
}
