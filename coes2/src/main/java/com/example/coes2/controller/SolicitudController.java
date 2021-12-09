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

import com.example.coes2.bean.Solicitud;
import com.example.coes2.service.SolicitudService;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {
    @Autowired
    SolicitudService solicitudService;

    @GetMapping
    public List<Solicitud> obtenerTodos() {
        return solicitudService.obtenerTodos();
    }
}
