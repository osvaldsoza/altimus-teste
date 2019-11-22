package com.osvaldsoza.altimusapi.controllers;

import com.osvaldsoza.altimusapi.models.Opcional;
import com.osvaldsoza.altimusapi.service.OpcionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/opcionais")
@CrossOrigin(maxAge = 10, origins = {"*"})
public class OpcionalController {
    @Autowired
    private OpcionalService service;

    @GetMapping
    public List<Opcional> getOpcionais() {
        return service.getOpcionaisVeiculo();
    }

}
