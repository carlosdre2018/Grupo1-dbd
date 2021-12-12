package com.example.coes2.dao;

import com.example.coes2.bean.Solicitud;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class SolicitudDao implements Dao<Solicitud> {
    @Autowired
    JdbcTemplate template;

    public List<Solicitud> obtenerTodos() {
        List<Solicitud> res = new ArrayList<>();
        String sql = "SELECT * FROM SOLICITUD ORDER BY FECHA_EMISION ASC";
        SqlRowSet rs = template.queryForRowSet(sql);
        while (rs.next()) {
            res.add(obtenerRegistro(rs));
        }
        return res;
    }

    public void agregar(Solicitud solicitud) {
        String sql = "INSERT INTO SOLICITUD(FECHA_EMISION, FECHA_TENTATIVA, ID_EMPRESA, ID_EQUIPO, ID_CENTRAL, COMENTARIO, ESTADO) VALUES (current_date,?,?,?,?,?,'EN ESPERA');";
        template.update(sql, solicitud.getFECHA_TENTATIVA(), solicitud.getID_EMPRESA(), solicitud.getID_EQUIPO(),
                solicitud.getID_CENTRAL(), solicitud.getCOMENTARIO());
    }

    public Solicitud buscar(Long id) {
        Solicitud solicitud = null;
        String sql = "SELECT * FROM SOLICITUD WHERE ID_SOLICITUD=?";
        SqlRowSet rs = template.queryForRowSet(sql, id);
        if (rs.next()) {
            solicitud = obtenerRegistro(rs);
        }
        return solicitud;
    }

    public void actualizar(Solicitud solicitud) {
        String sql = "UPDATE SOLICITUD SET FECHA_EMISION = ?, FECHA_TENTATIVA=?)" + "WHERE ID_SOLICITUD=?";
        template.update(sql, solicitud.getFECHA_EMISION(), solicitud.getFECHA_TENTATIVA(), solicitud.getID_SOLICITUD());
    }

    public void eliminar(Solicitud solicitud) {
        String sql = "DELETE FROM SOLICITUD WHERE ID_SOLICITUD=?";
        template.update(sql, solicitud.getID_SOLICITUD());
    }

    private Solicitud obtenerRegistro(SqlRowSet rs) {
        Solicitud solicitud = new Solicitud();
        solicitud.setID_SOLICITUD(rs.getLong("ID_SOLICITUD"));
        if (rs.getDate("FECHA_EMISION") != null) {
            solicitud.setFECHA_EMISION(rs.getDate("FECHA_EMISION").toLocalDate());
        }

        solicitud.setCOMENTARIO(rs.getString("COMENTARIO"));
        solicitud.setESTADO(rs.getString("ESTADO"));
        solicitud.setID_EMPRESA(rs.getLong("ID_EMPRESA"));
        solicitud.setID_EQUIPO(rs.getLong("ID_EQUIPO"));
        solicitud.setID_CENTRAL(rs.getLong("ID_CENTRAL"));
        if (rs.getDate("FECHA_TENTATIVA") != null) {
            solicitud.setFECHA_TENTATIVA(rs.getDate("FECHA_TENTATIVA").toLocalDate());
        }
        return solicitud;
    }

}