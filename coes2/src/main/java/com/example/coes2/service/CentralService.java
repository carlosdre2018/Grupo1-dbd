package com.example.coes2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coes2.bean.Central;
import com.example.coes2.dao.CentralDao;

@Service
public class CentralService {
    @Autowired
    CentralDao centralDao;

    public List<Central> obtenerTodos() {
        return centralDao.obtenerTodos();
    }

    public Central buscar(Long id) {
        return centralDao.buscar(id);
    }

    public void agregar(Central central) {
        centralDao.agregar(central);
    }

    public void actualizar(Central central) {
        centralDao.actualizar(central);
    }

    public void eliminar(Central central) {
        centralDao.eliminar(central);
    }
}
