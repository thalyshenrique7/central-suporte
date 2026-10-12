package com.thalysdev.central_suporte.dto.request;

import com.thalysdev.central_suporte.enums.TipoUsuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioRequest(
        @NotBlank String nome,
        @NotBlank @Email String email,
        @NotNull TipoUsuario tipoUsuario
) {
}
