package com.example.coes2.dao;

import com.example.coes2.bean.Equipo;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class EquipoDao {
    @Autowired
    JdbcTemplate template;

    public List<Equipo> obtenerTodos() {
        List<Equipo> res = new ArrayList<>();
        String sql = "SELECT * FROM EQUIPO";
        SqlRowSet rs = template.queryForRowSet(sql);
        while (rs.next()) {
            res.add(obtenerRegistro(rs));
        }
        return res;
    }

    public void agregar(Equipo equipo) {
        String sql = "INSERT INTO EQUIPO(ID_EQUIPO, NOMBRE, POTENCIA_FABRICANTE, TIPO_EQUIPO, POTENCIA_ACTUAL, ID_EMPRESA) VALUES(?,?,?,?,?,?)";
        template.update(sql, equipo.getID_EQUIPO(), equipo.getNOMBRE(), equipo.getPOTENCIA_FABRICANTE(),
                equipo.getTIPO_EQUIPO(), equipo.getPOTENCIA_ACTUAL(), equipo.getID_EMPRESA());
    }

    public Equipo buscar(Long id) {
        Equipo equipo = null;
        String sql = "SELECT * FROM EQUIPO WHERE ID_EQUIPO=?";
        SqlRowSet rs = template.queryForRowSet(sql, id);
        if (rs.next()) {
            equipo = obtenerRegistro(rs);
        }
        return equipo;
    }

    public void actualizar(Equipo equipo) {
        String sql = "UPDATE EQUIPO SET NOMBRE = ?, POTENCIA_ACTUAL=?)" + "WHERE ID_EQUIPO=?";
        template.update(sql, equipo.getNOMBRE(), equipo.getPOTENCIA_ACTUAL(), equipo.getID_EQUIPO());
    }

    public void eliminar(Equipo equipo) {
        String sql = "DELETE FROM EQUIPO WHERE ID_EQUIPO=?";
        template.update(sql, equipo.getID_EQUIPO());
    }

    private Equipo obtenerRegistro(SqlRowSet rs) {
        Equipo equipo = new Equipo();
        equipo.setID_EQUIPO(rs.getLong("ID_EQUIPO"));
        equipo.setNOMBRE(rs.getString("NOMBRE"));
        equipo.setPOTENCIA_FABRICANTE(rs.getBigDecimal("POTENCIA_FABRICANTE"));
        equipo.setTIPO_EQUIPO(rs.getString("TIPO_EQUIPO"));
        equipo.setPOTENCIA_ACTUAL(rs.getBigDecimal("POTENCIA_ACTUAL"));
        equipo.setID_EMPRESA(rs.getLong("ID_EMPRESA"));
        return equipo;
    }
}