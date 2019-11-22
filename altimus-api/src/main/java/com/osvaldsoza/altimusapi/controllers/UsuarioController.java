package com.osvaldsoza.altimusapi.controllers;

import com.osvaldsoza.altimusapi.models.Usuario;
import com.osvaldsoza.altimusapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(maxAge = 10, origins = {"*"})
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping("/{login}")
    public Usuario getUsuarios(@PathVariable String login){
        return service.getusuarios(login);
    }
}
