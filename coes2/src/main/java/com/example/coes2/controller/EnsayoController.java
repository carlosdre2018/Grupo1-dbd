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

import com.example.coes2.bean.Ensayo;
import com.example.coes2.service.EnsayoService;

@RestController
@RequestMapping("/ensayo")
public class EnsayoController {
    @Autowired
    EnsayoService ensayoService;

    @GetMapping
    public List<Ensayo> obtenerTodos() {
        return ensayoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Ensayo buscar(@PathVariable Long id) {
        return ensayoService.buscar(id);
    }

    @PostMapping
    public void agregar(@RequestBody Ensayo ensayo) {
        ensayoService.agregar(ensayo);
    }

    @PatchMapping
    public void actualizar(@RequestBody Ensayo ensayo) {
        ensayoService.actualizar(ensayo);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Ensayo ensayo) {
        ensayoService.eliminar(ensayo);
    }
}
