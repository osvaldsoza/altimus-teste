package com.osvaldsoza.altimusapi.controllers;

import com.osvaldsoza.altimusapi.models.Usuario;
import com.osvaldsoza.altimusapi.service.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService service;

    public List<Usuario> getUsuarios(){
        return service.getusuarios();
    }
}
