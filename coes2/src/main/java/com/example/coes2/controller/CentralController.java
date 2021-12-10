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

import com.example.coes2.bean.Central;
import com.example.coes2.service.CentralService;

@RestController
@RequestMapping("/central")
public class CentralController {
    @Autowired
    CentralService centralService;

    @GetMapping
    public List<Central> obtenerTodos() {
        return centralService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Central buscar(@PathVariable Long id) {
        return centralService.buscar(id);
    }

    @PostMapping
    public void agregar(@RequestBody Central central) {
        centralService.agregar(central);
    }

    @PatchMapping
    public void actualizar(@RequestBody Central central) {
        centralService.actualizar(central);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Central central) {
        centralService.eliminar(central);
    }
}
