package com.example.peliculas.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.peliculas.entity.User;
import com.example.peliculas.exception.DataAccessException;
import com.example.peliculas.repository.UserRepository;

public class UserController extends BaseController{

	public UserController(DataSource ds) {
		super(ds);

	}
	
	@GetMapping
    public List<User> index() {
        try (Connection con = ds.getConnection()) {
            UserRepository repo = new UserRepository(con);
            return repo.findAll();
        } catch (SQLException e) {
            throw new DataAccessException("Error al obtener usuarios", e);
        }
    }

}
