package com.example.coes2.dao;

import com.example.coes2.bean.Central;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class CentralDao implements Dao<Central> {
    @Autowired
    JdbcTemplate template;

    public List<Central> obtenerTodos() {
        List<Central> res = new ArrayList<>();
        String sql = "SELECT * FROM CENTRAL";
        SqlRowSet rs = template.queryForRowSet(sql);
        while (rs.next()) {
            res.add(obtenerRegistro(rs));
        }
        return res;
    }

    public void agregar(Central central) {
        String sql = "INSERT INTO CENTRAL(NOMBRE, TIPO_CENTRAL, DIRECCION, N_UNI_GENERACION, ABREVIATURA, REGION, ID_EMPRESA) VALUES(?,?,?,?,?,?,?)";
        template.update(sql, central.getNOMBRE(), central.getTIPO_CENTRAL(), central.getDIRECCION(),
                central.getN_UNI_GENERACION(), central.getABREVIATURA(), central.getREGION(),
                central.getID_EMPRESA());
    }

    public Central buscar(Long id) {
        Central central = null;
        String sql = "SELECT * FROM CENTRAL WHERE ID_CENTRAL=?";
        SqlRowSet rs = template.queryForRowSet(sql, id);
        if (rs.next()) {
            central = obtenerRegistro(rs);
        }
        return central;
    }

    public void actualizar(Central central) {
        String sql = "UPDATE CENTRAL SET NOMBRE = ?, N_UNI_GENERACION=?)" + "WHERE ID_CENTRAL=?";
        template.update(sql, central.getNOMBRE(), central.getN_UNI_GENERACION(), central.getID_CENTRAL());
    }

    public void eliminar(Central central) {
        String sql = "DELETE FROM CENTRAL WHERE ID_CENTRAL=?";
        template.update(sql, central.getID_CENTRAL());
    }

    private Central obtenerRegistro(SqlRowSet rs) {
        Central central = new Central();
        central.setID_CENTRAL(rs.getLong("ID_CENTRAL"));
        central.setNOMBRE(rs.getString("NOMBRE"));
        central.setTIPO_CENTRAL(rs.getString("TIPO_DIRECCION"));
        central.setDIRECCION(rs.getString("DIRECCION"));
        central.setN_UNI_GENERACION(rs.getLong("N_UNI_GENERACION"));
        central.setABREVIATURA(rs.getString("ABREVIATURA"));
        central.setREGION(rs.getString("REGION"));
        central.setID_EMPRESA(rs.getLong("ID_EMPRESA"));
        return central;
    }
}