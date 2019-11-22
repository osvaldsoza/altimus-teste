package com.osvaldsoza.altimusapi.repository;

import com.osvaldsoza.altimusapi.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {

    public List<Veiculo> findByPlaca(String placa);
}
