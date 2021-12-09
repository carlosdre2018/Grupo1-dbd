package com.example.coes2.dao;

import com.example.coes2.bean.Solicitud;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class SolicitudDao implements Dao<Solicitud> {
    @Autowired
    JdbcTemplate template;

    public List<Solicitud> obtenerTodos(){
        List<Solicitud> res
    }
}
