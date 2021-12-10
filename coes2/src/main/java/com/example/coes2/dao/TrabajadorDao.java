package com.example.coes2.dao;

import com.example.coes2.bean.Trabajador;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class TrabajadorDao {
    @Autowired
    JdbcTemplate template;

    public List<Trabajador> obtenerTodos() {
        List<Trabajador> res = new ArrayList<>();
        String sql = "SELECT * FROM TRABAJADOR";
        SqlRowSet rs = template.queryForRowSet(sql);
        while (rs.next()) {
            res.add(obtenerRegistro(rs));
        }
        return res;
    }

    public void agregar(Trabajador trabajador) {
        String sql = "INSERT INTO TRABAJADOR(ID_TRABAJADOR, DISPONIBILIDAD, TELEFONO, APELLIDO_PATERNO, APELLIDO_MATERNO, NOMBRES) VALUES(?,?,?,?,?,?)";
        template.update(sql, trabajador.getID_TRABAJADOR(), trabajador.getDISPONIBILIDAD(), trabajador.getTELEFONO(),
                trabajador.getAPELLIDO_PATERNO(), trabajador.getAPELLIDO_MATERNO(), trabajador.getNOMBRES());
    }

    public Trabajador buscar(Long id) {
        Trabajador trabajador = null;
        String sql = "SELECT * FROM TRABAJADOR WHERE ID_TRABAJADOR=?";
        SqlRowSet rs = template.queryForRowSet(sql, id);
        if (rs.next()) {
            trabajador = obtenerRegistro(rs);
        }
        return trabajador;
    }

    public void actualizar(Trabajador trabajador) {
        String sql = "UPDATE TRABAJADOR SET DISPONIBILIDAD = ?, TELEFONO=?)" + "WHERE ID_TRABAJADOR=?";
        template.update(sql, trabajador.getDISPONIBILIDAD(), trabajador.getTELEFONO(), trabajador.getID_TRABAJADOR());
    }

    public void eliminar(Trabajador trabajador) {
        String sql = "DELETE FROM TRABAJADOR WHERE ID_TRABAJADOR=?";
        template.update(sql, trabajador.getID_TRABAJADOR());
    }

    private Trabajador obtenerRegistro(SqlRowSet rs) {
        Trabajador trabajador = new Trabajador();
        trabajador.setID_TRABAJADOR(rs.getLong("ID_TRABAJADOR"));
        trabajador.setDISPONIBILIDAD(rs.getString("DISPONIBILIDAD"));
        trabajador.setTELEFONO(rs.getLong("TELEFONO"));
        trabajador.setAPELLIDO_PATERNO(rs.getString("APELLIDO_PATERNO"));
        trabajador.setAPELLIDO_MATERNO(rs.getString("APELLIDO_MATERNO"));
        trabajador.setNOMBRES(rs.getString("NOMBRES"));
        return trabajador;
    }
}
