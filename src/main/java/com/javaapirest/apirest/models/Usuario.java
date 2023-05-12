package com.javaapirest.apirest.models;

import java.time.LocalDate;
import java.util.UUID;

public class Usuario {

    private final UUID idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String password;
    private final LocalDate fecha_creado;

    public Usuario(String nombre, String apellido, String email, String telefono, String password) {

        this.idUsuario = UUID.randomUUID();
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setTelefono(telefono);
        setPassword(password);
        this.fecha_creado = LocalDate.now();
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public LocalDate getFecha_creado() {
        return fecha_creado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null) {
            this.apellido = apellido;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null) {
            this.telefono = telefono;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", password='" + password + '\'' +
                ", fecha_creado=" + fecha_creado +
                '}';
    }
}
