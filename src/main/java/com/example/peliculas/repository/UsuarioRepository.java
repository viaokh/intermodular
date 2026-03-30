package com.example.peliculas.repository;
import java.sql.Connection;
import com.example.peliculas.entity.Usuario;

public class UsuarioRepository extends BaseRepository<Usuario> {

    public UsuarioRepository(Connection con) {
        super(con, rs -> new Usuario(
            rs.getInt("id_usuario"),
            rs.getString("nombre"),
            rs.getString("apellido"),
            rs.getString("email"),
            rs.getString("contrasenya"),
            rs.getString("rol_de_usuario"),
            rs.getString("telefono"),
            rs.getString("estado_usuario"),
            rs.getString("metodo_pago")
        ));
    }

    @Override
    public String getTable() { return "usuarios"; }

    @Override
    public String getPrimaryKeyName() { return "id_usuario"; }

    @Override
    public Integer getPrimaryKey(Usuario u) { return u.getId(); }  // ← NUEVO

    @Override
    public void setPrimaryKey(Usuario u, int id) { u.setId(id); }

    @Override
    public String[] getColumnNames() {
        return new String[]{"id_usuario", "nombre", "apellido", "email", "contrasenya", "rol_de_usuario", "telefono", "estado_usuario", "metodo_pago"};
    }

    @Override
    public Object[] getInsertValues(Usuario u) {
        return new Object[]{u.getNombre(), u.getApellido(), u.getEmail(), u.getContrasenya(), u.getRolDeUsuario(), u.getTelefono(), u.getEstadoUsuario(), u.getMetodoPago()};
    }

    @Override
    public Object[] getUpdateValues(Usuario u) {
        return new Object[]{u.getNombre(), u.getApellido(), u.getEmail(), u.getContrasenya(), u.getRolDeUsuario(), u.getTelefono(), u.getEstadoUsuario(), u.getMetodoPago(), u.getId()};
    }
}