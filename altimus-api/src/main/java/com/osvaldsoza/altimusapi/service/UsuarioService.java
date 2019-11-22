package com.osvaldsoza.altimusapi.service;

import com.osvaldsoza.altimusapi.models.Usuario;
import com.osvaldsoza.altimusapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario getusuarios(String login) {
        return repository.findByLogin(login);
    }
}
