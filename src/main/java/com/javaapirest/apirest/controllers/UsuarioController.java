package com.javaapirest.apirest.controllers;

import com.javaapirest.apirest.dao.UsuarioDao;
import com.javaapirest.apirest.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping(value="api/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @GetMapping(value="api/usuarios/desactivados")
    public List<Usuario> getUsuariosDesactivados() {
        return usuarioDao.getUsuariosDesactivados();
    }

    @GetMapping(value="api/usuarios/{id}")
    public Usuario getUsuarioById(@PathVariable double id) {
        return usuarioDao.getUsuarioById(id);
    }

    @DeleteMapping(value="api/usuarios/{id}")
    public void deleteUsuario(@PathVariable double id) {
        usuarioDao.deleteUsuario(id);
    }

    @PostMapping(value="api/usuarios")
    public void postUser(@RequestBody Usuario usuario) {
        usuarioDao.postUser(usuario);
    }
}
