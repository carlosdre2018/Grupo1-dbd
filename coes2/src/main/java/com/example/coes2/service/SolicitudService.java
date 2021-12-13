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

    public Solicitud buscar(Long id) {
        return solicitudDao.buscar(id);
    }

    public void agregar(Solicitud solicitud) {
        solicitudDao.agregar(solicitud);
    }

    public void actualizar(Solicitud solicitud) {
        solicitudDao.actualizar(solicitud);
    }

    public void eliminar(Solicitud solicitud) {
        solicitudDao.eliminar(solicitud);
    }
}