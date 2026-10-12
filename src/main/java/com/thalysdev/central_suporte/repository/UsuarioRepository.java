package com.thalysdev.central_suporte.repository;

import com.thalysdev.central_suporte.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
