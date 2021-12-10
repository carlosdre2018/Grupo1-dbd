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

import com.example.coes2.bean.Equipo;
import com.example.coes2.service.EquipoService;

@RestController
@RequestMapping("/equipo")
public class EquipoController {
    @Autowired
    EquipoService equipoService;

    @GetMapping
    public List<Equipo> obtenerTodos() {
        return equipoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Equipo buscar(@PathVariable Long id) {
        return equipoService.buscar(id);
    }

    @PostMapping
    public void agregar(@RequestBody Equipo equipo) {
        equipoService.agregar(equipo);
    }

    @PatchMapping
    public void actualizar(@RequestBody Equipo equipo) {
        equipoService.actualizar(equipo);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Equipo equipo) {
        equipoService.eliminar(equipo);
    }
}
