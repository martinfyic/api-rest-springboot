package com.javaapirest.apirest.controllers;

import com.javaapirest.apirest.dao.UsuarioDao;
import com.javaapirest.apirest.models.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @GetMapping(value="")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @GetMapping(value="/desactivados")
    public List<Usuario> getUsuariosDesactivados() {
        return usuarioDao.getUsuariosDesactivados();
    }

    @GetMapping(value="/{id}")
    public Usuario getUsuarioById(@PathVariable double id) {
        return usuarioDao.getUsuarioById(id);
    }

    @DeleteMapping(value="/{id}")
    public void deleteUsuario(@PathVariable double id) {
        usuarioDao.deleteUsuario(id);
    }

    @PostMapping(value="")
    public void postUser(@RequestBody Usuario usuario) {
        usuarioDao.postUsuario(usuario);
    }

    @PatchMapping(value="/{id}")
    public void patchUser(@PathVariable double id, @RequestBody Usuario usuario) {
        usuarioDao.patchUsuario(id, usuario);
    }
}
