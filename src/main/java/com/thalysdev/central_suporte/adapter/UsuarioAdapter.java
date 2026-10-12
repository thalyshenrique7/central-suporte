package com.thalysdev.central_suporte.adapter;

import com.thalysdev.central_suporte.dto.response.UsuarioResponse;
import com.thalysdev.central_suporte.entity.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioAdapter {

    public UsuarioResponse paraResponse(Usuario usuario) {
        return new UsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getTipoUsuario(),
                usuario.getDataCriacao(),
                usuario.getDataAlteracao()
        );
    }
}
