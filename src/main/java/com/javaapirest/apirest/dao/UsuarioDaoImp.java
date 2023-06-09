package com.javaapirest.apirest.dao;

import com.javaapirest.apirest.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {

        String query = "FROM Usuario u WHERE u.activo = true";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Usuario> getUsuariosDesactivados() {

        String query = "FROM Usuario u WHERE u.activo = false";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void postUsuario(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public Usuario getUsuarioById(double id) {

        return entityManager.find(Usuario.class, id);
    }

    @Override
    public void deleteUsuario(double id) {

        //Eliminar de DB
        //Usuario usuario = entityManager.find(Usuario.class, id);
        //entityManager.remove(usuario);

        //Eliminar soft-delete
        String query = "UPDATE Usuario u SET u.activo = false WHERE u.id = :id";
        entityManager.createQuery(query).setParameter("id", id).executeUpdate();
    }

    @Override
    public void patchUsuario(double id, Usuario usuario) {

        /*
        ===================================================
        Terminar de completar logica de actualizar usuario
        ===================================================
        */

    }
}
