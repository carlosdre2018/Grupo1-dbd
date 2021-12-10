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

import com.example.coes2.bean.Empresa;
import com.example.coes2.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping
    public List<Empresa> obtenerTodos() {
        return empresaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Empresa buscar(@PathVariable Long id) {
        return empresaService.buscar(id);
    }

    @PostMapping
    public void agregar(@RequestBody Empresa empresa) {
        empresaService.agregar(empresa);
    }

    @PatchMapping
    public void actualizar(@RequestBody Empresa empresa) {
        empresaService.actualizar(empresa);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Empresa empresa) {
        empresaService.eliminar(empresa);
    }
}
