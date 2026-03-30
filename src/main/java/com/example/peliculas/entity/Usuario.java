package com.example.peliculas.entity;

public class Usuario {

    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasenya;
    private String rolDeUsuario;
    private String telefono;
    private String estadoUsuario;
    private String metodoPago;

    public Usuario(Integer id, String nombre, String apellido, String email, String contrasenya, String rolDeUsuario, String telefono, String estadoUsuario, String metodoPago) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasenya = contrasenya;
        this.rolDeUsuario = rolDeUsuario;
        this.telefono = telefono;
        this.estadoUsuario = estadoUsuario;
        this.metodoPago = metodoPago;
    }

    public Usuario(String nombre, String apellido, String email, String contrasenya, String rolDeUsuario, String telefono, String estadoUsuario, String metodoPago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasenya = contrasenya;
        this.rolDeUsuario = rolDeUsuario;
        this.telefono = telefono;
        this.estadoUsuario = estadoUsuario;
        this.metodoPago = metodoPago;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public String getRolDeUsuario() {
		return rolDeUsuario;
	}

	public void setRolDeUsuario(String rolDeUsuario) {
		this.rolDeUsuario = rolDeUsuario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(String estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}


}