package com.osvaldsoza.altimusapi.service;

import com.osvaldsoza.altimusapi.models.Opcional;
import com.osvaldsoza.altimusapi.repository.OpcionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpcionalService {

    @Autowired
    private OpcionalRepository repository;

    public List<Opcional> getOpcionaisVeiculo(){
        return repository.findAll();
    }

}
