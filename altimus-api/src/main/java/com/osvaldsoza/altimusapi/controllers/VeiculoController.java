package com.osvaldsoza.altimusapi.controllers;


import com.osvaldsoza.altimusapi.models.Veiculo;
import com.osvaldsoza.altimusapi.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
@CrossOrigin(maxAge = 10, origins = {"*"})
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public List<Veiculo> getVeiculos() {
        return service.getVeiculos();
    }

    @GetMapping("/{placa}")
    public List<Veiculo> getVeiculoByPlaca(@PathVariable String placa){
        return service.getVeiculoByPlaca(placa);
    }

    @PostMapping
    public Veiculo postVeiculo(@RequestBody  Veiculo veiculo) {
        return service.postVeiculo(veiculo);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> deleteVeiculoByCodigo(@PathVariable Long codigo){
        service.deleteVeiculoByCodigo(codigo);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
