package com.example.peliculas.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.peliculas.dto.UserResponse;

public class UserResponseMapper implements RowMapper<UserResponse> {

	@Override
	public UserResponse map(ResultSet rs) throws SQLException {
		return new UserResponse(
		        rs.getInt("id_usuario"),
		        rs.getString("nombre"),
		        rs.getString("email"),
		        rs.getString("rol_de_usuario")
		);
	}
}
