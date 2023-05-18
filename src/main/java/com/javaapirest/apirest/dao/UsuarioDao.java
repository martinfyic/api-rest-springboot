package com.javaapirest.apirest.dao;

import com.javaapirest.apirest.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    Usuario getUsuarioById(double id);

    void deleteUsuario(double id);

    List<Usuario> getUsuariosDesactivados();

    void postUser(Usuario usuario);
}
