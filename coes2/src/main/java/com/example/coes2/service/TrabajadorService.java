package com.example.coes2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coes2.bean.Trabajador;
import com.example.coes2.dao.TrabajadorDao;

@Service
public class TrabajadorService {
    @Autowired
    TrabajadorDao trabajadorDao;

    public List<Trabajador> obtenerTodos() {
        return trabajadorDao.obtenerTodos();
    }

    public Trabajador buscar(Long id) {
        return trabajadorDao.buscar(id);
    }

    public void agregar(Trabajador trabajador) {
        trabajadorDao.agregar(trabajador);
    }

    public void actualizar(Trabajador trabajador) {
        trabajadorDao.actualizar(trabajador);
    }

    public void eliminar(Trabajador trabajador) {
        trabajadorDao.eliminar(trabajador);
    }
}
