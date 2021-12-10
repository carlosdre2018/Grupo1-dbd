package com.example.coes2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coes2.bean.Empresa;
import com.example.coes2.dao.EmpresaDao;

@Service
public class EmpresaService {
    @Autowired
    EmpresaDao empresaDao;

    public List<Empresa> obtenerTodos() {
        return empresaDao.obtenerTodos();
    }

    public Empresa buscar(Long id) {
        return empresaDao.buscar(id);
    }

    public void agregar(Empresa empresa) {
        empresaDao.agregar(empresa);
    }

    public void actualizar(Empresa empresa) {
        empresaDao.actualizar(empresa);
    }

    public void eliminar(Empresa empresa) {
        empresaDao.eliminar(empresa);
    }
}
