package com.osvaldsoza.altimusapi.service;

import com.osvaldsoza.altimusapi.models.Veiculo;
import com.osvaldsoza.altimusapi.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> getVeiculos() {
        return repository.findAll();
    }

    public List<Veiculo> getVeiculoByPlaca(String placa){
        return repository.findByPlaca(placa);
    }

    public Veiculo postVeiculo(Veiculo veiculo){
        return repository.save(veiculo);
    }

    public void deleteVeiculoByCodigo(Long codigo) {
        Optional<Veiculo> veiculo = repository.findById(codigo);
        if (veiculo.isPresent()) {
            repository.deleteById(codigo);
        }
    }
}
