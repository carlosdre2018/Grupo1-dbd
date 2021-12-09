package com.example.coes.dao;

import java.util.List;

public class Dao {
    List<T> obtenerTodos();

    void agregar(T t);

    void actualizar(T t);

    void eliminar(T t);
}
