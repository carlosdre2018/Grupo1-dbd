package com.example.coes2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.coes2.bean.Usuario;
import com.example.coes2.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> obtenerTodos() {
        return usuarioService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id) {
        return usuarioService.buscar(id);
    }

    @PostMapping
    public void agregar(@RequestBody Usuario usuario) {
        usuarioService.agregar(usuario);
    }

    @PatchMapping
    public void actualizar(@RequestBody Usuario usuario) {
        usuarioService.actualizar(usuario);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Usuario usuario) {
        usuarioService.eliminar(usuario);
    }
}
