package com.example.peliculas.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.peliculas.entity.Usuario;
import com.example.peliculas.exception.DataAccessException;
import com.example.peliculas.repository.UsuarioRepository;

public class UsuarioController extends BaseController{

	public UsuarioController(DataSource ds) {
		super(ds);

	}
	
	@GetMapping
    public List<Usuario> index() {
        try (Connection con = ds.getConnection()) {
            UsuarioRepository repo = new UsuarioRepository(con);
            return repo.findAll();
        } catch (SQLException e) {
            throw new DataAccessException("Error al obtener usuarios", e);
        }
    }

}
