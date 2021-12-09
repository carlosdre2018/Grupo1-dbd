package com.example.coes2.service;

import java.util.List;

import com.example.coes2.bean.Solicitud;
import com.example.coes2.dao.SolicitudDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudService {
    @Autowired
    SolicitudDao solicitudDao;

    public List<Solicitud> obtenerTodos() {
        return solicitudDao.obtenerTodos();
    }
}