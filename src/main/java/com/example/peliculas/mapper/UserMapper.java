package com.example.peliculas.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.peliculas.entity.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User map(ResultSet rs) throws SQLException {
		return new User(
	            rs.getInt("id_usuario"),
	            rs.getString("nombre"),
	            rs.getString("apellido"),
	            rs.getString("email"),
	            rs.getString("contrasenya"),
	            rs.getString("rol_de_usuario"),
	            rs.getString("telefono"),
	            rs.getString("estado_usuario"),
	            rs.getString("metodo_pago")
	        );
	}
}
