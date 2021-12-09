package com.example.coes2.dao;

import com.example.coes2.bean.Empresa;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class EmpresaDao implements Dao<Empresa> {
    @Autowired
    JdbcTemplate template;

    public List<Empresa> obtenerTodos() {
        List<Empresa> res = new ArrayList<>();
        String sql = "SELECT * FROM EMPRESA";
        SqlRowSet rs = template.queryForRowSet(sql);
        while (rs.next()) {
            res.add(obtenerRegistro(rs));
        }
        return res;
    }

    public void agregar(Empresa empresa) {
        String sql = "INSERT INTO EMPRESA(RAZON_SOCIAL, FECHA_RETIRO, NOMBRE, CORREO, TELEFONO) VALUES(?,?,?,?,?)";
        template.update(sql, empresa.getRAZON_SOCIAL(), empresa.getFECHA_RETIRO(), empresa.getNOMBRE(),
                empresa.getCORREO(), empresa.getTELEFONO());
    }

    public Empresa buscar(Long id) {
        Empresa empresa = null;
        String sql = "SELECT * FROM EMPRESA WHERE ID_EMPRESA=?";
        SqlRowSet rs = template.queryForRowSet(sql, id);
        if (rs.next()) {
            empresa = obtenerRegistro(rs);
        }
        return empresa;
    }

    public void actualizar(Empresa empresa) {
        String sql = "UPDATE EMPRESA SET RAZON_SOCIAL = ?, TELEFONO=?)" + "WHERE ID_EMPRESA=?";
        template.update(sql, empresa.getRAZON_SOCIAL(), empresa.getTELEFONO(), empresa.getID_EMPRESA());
    }

    public void eliminar(Empresa empresa) {
        String sql = "DELETE FROM EMPRESA WHERE ID_EMPRESA=?";
        template.update(sql, empresa.getID_EMPRESA());
    }

    private Empresa obtenerRegistro(SqlRowSet rs) {
        Empresa empresa = new Empresa();
        empresa.setID_EMPRESA(rs.getLong("ID_EMPRESA"));
        empresa.setRAZON_SOCIAL(rs.getString("RAZON_SOCIAL"));
        empresa.setNOMBRE(rs.getString("NOMBRE"));
        empresa.setNOMBRE(rs.getString("CORREO"));
        empresa.setTELEFONO(rs.getLong("TELEFONO"));
        if (rs.getDate("FECHA_RETIRO") != null) {
            empresa.setFECHA_RETIRO(rs.getDate("FECHA_RETIRO").toLocalDate());
        }
        return empresa;
    }

}