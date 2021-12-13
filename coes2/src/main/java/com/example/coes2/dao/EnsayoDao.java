package com.example.coes2.dao;

import com.example.coes2.bean.Ensayo;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class EnsayoDao implements Dao<Ensayo> {
    @Autowired
    JdbcTemplate template;

    public List<Ensayo> obtenerTodos() {
        List<Ensayo> res = new ArrayList<>();
        String sql = "SELECT * FROM ENSAYO ORDER BY FECHA_PROGRAMADA ASC";
        SqlRowSet rs = template.queryForRowSet(sql);
        while (rs.next()) {
            res.add(obtenerRegistro(rs));
        }
        return res;
    }

    public void agregar(Ensayo ensayo) {
        String sql = "INSERT INTO ENSAYO(ESTADO_ENSAYO, FECHA_PROGRAMADA, COMENTARIO, ID_TRABAJADOR, ID_SOLICITUD) VALUES('NO REALIZADO',?,?,?,?); UPDATE SOLICITUD SET ESTADO='APROBADO' WHERE ID_SOLICITUD=?;";
        template.update(sql, ensayo.getFECHA_PROGRAMADA(), ensayo.getCOMENTARIO(),
                ensayo.getID_TRABAJADOR(), ensayo.getID_SOLICITUD(), ensayo.getID_SOLICITUD());
    }

    public Ensayo buscar(Long id) {
        Ensayo ensayo = null;
        String sql = "SELECT * FROM ENSAYO WHERE ID_ENSAYO=?";
        SqlRowSet rs = template.queryForRowSet(sql, id);
        if (rs.next()) {
            ensayo = obtenerRegistro(rs);
        }
        return ensayo;
    }

    public void actualizar(Ensayo ensayo) {
        String sql = "UPDATE ENSAYO SET ESTADO_ENSAYO = ?, FECHA_FIN=?, ID_TRABAJADOR=?)" + "WHERE ID_ENSAYO=?";
        template.update(sql, ensayo.getESTADO_ENSAYO(), ensayo.getFECHA_FIN(), ensayo.getID_TRABAJADOR(),
                ensayo.getID_ENSAYO());
    }

    public void eliminar(Ensayo ensayo) {
        String sql = "DELETE FROM ENSAYO WHERE ID_ENSAYO=?";
        template.update(sql, ensayo.getID_ENSAYO());
    }

    private Ensayo obtenerRegistro(SqlRowSet rs) {
        Ensayo ensayo = new Ensayo();
        ensayo.setID_ENSAYO(rs.getLong("ID_ENSAYO"));
        ensayo.setESTADO_ENSAYO(rs.getString("ESTADO_ENSAYO"));
        ensayo.setCOMENTARIO(rs.getString("COMENTARIO"));
        ensayo.setID_TRABAJADOR(rs.getLong("ID_TRABAJADOR"));
        ensayo.setID_SOLICITUD(rs.getLong("ID_SOLICITUD"));
        if (rs.getDate("FECHA_PROGRAMADA") != null) {
            ensayo.setFECHA_PROGRAMADA(rs.getDate("FECHA_PROGRAMADA").toLocalDate());
        }
        if (rs.getDate("FECHA_FIN") != null) {
            ensayo.setFECHA_FIN(rs.getDate("FECHA_FIN").toLocalDate());
        }
        return ensayo;
    }

}
