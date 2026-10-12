package com.thalysdev.central_suporte.dto.response;

import com.thalysdev.central_suporte.enums.TipoUsuario;
import java.time.Instant;

public record UsuarioResponse(
        Long id,
        String nome,
        String email,
        TipoUsuario tipoUsuario,
        Instant dataCriacao,
        Instant dataAlteracao
) {
}
