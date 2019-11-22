package com.osvaldsoza.altimusapi.service;

import com.osvaldsoza.altimusapi.models.Usuario;
import com.osvaldsoza.altimusapi.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository repository;

    public List<Usuario> getusuarios() {
        return repository.findAll();
    }
}
