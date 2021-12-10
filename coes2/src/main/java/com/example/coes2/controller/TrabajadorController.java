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

import com.example.coes2.bean.Trabajador;
import com.example.coes2.service.TrabajadorService;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {
    @Autowired
    TrabajadorService trabajadorService;

    @GetMapping
    public List<Trabajador> obtenerTodos() {
        return trabajadorService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Trabajador buscar(@PathVariable Long id) {
        return trabajadorService.buscar(id);
    }

    @PostMapping
    public void agregar(@RequestBody Trabajador trabajador) {
        trabajadorService.agregar(trabajador);
    }

    @PatchMapping
    public void actualizar(@RequestBody Trabajador trabajador) {
        trabajadorService.actualizar(trabajador);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Trabajador trabajador) {
        trabajadorService.eliminar(trabajador);
    }
}
