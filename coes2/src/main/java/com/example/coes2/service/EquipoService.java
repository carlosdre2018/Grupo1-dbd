package com.example.coes2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coes2.bean.Equipo;
import com.example.coes2.dao.EquipoDao;

@Service
public class EquipoService {
    @Autowired
    EquipoDao equipoDao;

    public List<Equipo> obtenerTodos() {
        return equipoDao.obtenerTodos();
    }

    public Equipo buscar(Long id) {
        return equipoDao.buscar(id);
    }

    public void agregar(Equipo equipo) {
        equipoDao.agregar(equipo);
    }

    public void actualizar(Equipo equipo) {
        equipoDao.actualizar(equipo);
    }

    public void eliminar(Equipo equipo) {
        equipoDao.eliminar(equipo);
    }
}
