package com.example.coes2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coes2.bean.Ensayo;
import com.example.coes2.dao.EnsayoDao;

@Service
public class EnsayoService {
    @Autowired
    EnsayoDao ensayoDao;

    public List<Ensayo> obtenerTodos() {
        return ensayoDao.obtenerTodos();
    }

    public Ensayo buscar(Long id) {
        return ensayoDao.buscar(id);
    }

    public void agregar(Ensayo ensayo) {
        ensayoDao.agregar(ensayo);
    }

    public void actualizar(Ensayo ensayo) {
        ensayoDao.actualizar(ensayo);
    }

    public void eliminar(Ensayo ensayo) {
        ensayoDao.eliminar(ensayo);
    }
}
