package com.example.coes2.dao;

import com.example.coes2.bean.Usuario;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDao implements Dao<Usuario> {
    @Autowired
    JdbcTemplate template;

    public List<Usuario> obtenerTodos() {
        List<Usuario> res = new ArrayList<>();
        String sql = "SELECT * FROM USUARIO";
        SqlRowSet rs = template.queryForRowSet(sql);
        while (rs.next()) {
            res.add(obtenerRegistro(rs));
        }
        return res;
    }

    public void agregar(Usuario usuario) {
        String sql = "INSERT INTO USUARIO(ID_USUARIO, CONTRASENA, FECHA_INGRESO, TIPO_USUARIO, DIRECCION) VALUES(?,?,?,?)";
        template.update(sql, usuario.getID_USUARIO(), usuario.getCONTRASENA(), usuario.getFECHA_INGRESO(),
                usuario.getTIPO_USUARIO(), usuario.getDIRECCION());
    }

    public Usuario buscar(Long id) {
        Usuario usuario = null;
        String sql = "SELECT * FROM USUARIO WHERE ID_USUARIO=?";
        SqlRowSet rs = template.queryForRowSet(sql, id);
        if (rs.next()) {
            usuario = obtenerRegistro(rs);
        }
        return usuario;
    }

    public void actualizar(Usuario usuario) {
        String sql = "UPDATE USUARIO SET TIPO_USUARIO = ?, DIRECCION=?)" + "WHERE ID_USUARIO=?";
        template.update(sql, usuario.getTIPO_USUARIO(), usuario.getDIRECCION(), usuario.getID_USUARIO());
    }

    public void eliminar(Usuario usuario) {
        String sql = "DELETE FROM USUARIO WHERE ID_USUARIO=?";
        template.update(sql, usuario.getID_USUARIO());
    }

    private Usuario obtenerRegistro(SqlRowSet rs) {
        Usuario usuario = new Usuario();
        usuario.setID_USUARIO(rs.getLong("ID_USUARIO"));
        usuario.setCONTRASENA(rs.getString("CONTRASENA"));
        usuario.setTIPO_USUARIO(rs.getString("TIPO_USUARIO"));
        usuario.setDIRECCION(rs.getString("DIRECCION"));
        if (rs.getDate("FECHA_INGRESO") != null) {
            usuario.setFECHA_INGRESO(rs.getDate("FECHA_INGRESO").toLocalDate());
        }
        return usuario;
    }

}