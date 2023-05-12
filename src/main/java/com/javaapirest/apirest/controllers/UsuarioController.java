package com.javaapirest.apirest.controllers;

import com.javaapirest.apirest.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class UsuarioController {

    @GetMapping(value="/usuarios")
    public List<Usuario> getusuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario user1 = new Usuario("Martin", "Ferreira", "work@gmail.com", "09098434343", "2222222");
        Usuario user2 = new Usuario("Fernando", "Bueno", "work1@gmail.com", "4454543", "222r4rsdf2222");
        Usuario user3 = new Usuario("Marcos", "Padilla", "work2@gmail.com", "0909866329434343", "fweer4y");
        Usuario user4 = new Usuario("Federico", "Affonso", "work3@gmail.com", "0905984543", "Sdff");

        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);

        return usuarios;
    }

    @GetMapping(value="/usuario") // modificar URL para buscar por id {id}
    public Usuario getusuario() {
        return new Usuario("Martin", "Ferreira", "work@gmail.com", "09098434343", "2222222");
    }
}
