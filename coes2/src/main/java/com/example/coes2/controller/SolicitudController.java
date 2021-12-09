package com.example.coes2.controller;

import java.util.List;

import com.example.coes2.bean.Solicitud;
import com.example.coes2.service.SolicitudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {
    @Autowired
    SolicitudService solicitudService;

    @GetMapping
    public List<Solicitud> obtenerTodos(){
        return solicitudService.obtenerTodos();
    }
}
