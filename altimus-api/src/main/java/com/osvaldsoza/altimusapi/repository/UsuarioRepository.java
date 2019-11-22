package com.osvaldsoza.altimusapi.repository;

import com.osvaldsoza.altimusapi.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
