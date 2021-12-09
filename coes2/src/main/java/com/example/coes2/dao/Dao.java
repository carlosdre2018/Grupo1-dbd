package com.example.coes2.dao;

import java.util.List;

public class Dao {
    List<T> obtenerTodos();

    void agregar(T t);

    void actualizar(T t);

    void eliminar(T t);
}