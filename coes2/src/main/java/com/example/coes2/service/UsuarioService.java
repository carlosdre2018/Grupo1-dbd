package com.example.coes2.service;

import java.util.List;

import com.example.coes2.bean.Usuario;
import com.example.coes2.dao.UsuarioDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioDao usuarioDao;

    public List<Usuario> obtenerTodos() {
        return usuarioDao.obtenerTodos();
    }

    public Usuario buscar(Long id) {
        return usuarioDao.buscar(id);
    }

    public void agregar(Usuario usuario) {
        usuarioDao.agregar(usuario);
    }

    public void actualizar(Usuario usuario) {
        usuarioDao.actualizar(usuario);
    }

    public void eliminar(Usuario usuario) {
        usuarioDao.eliminar(usuario);
    }
}
