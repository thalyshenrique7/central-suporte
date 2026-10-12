package com.thalysdev.central_suporte.service;

import com.thalysdev.central_suporte.dto.request.UsuarioRequest;
import com.thalysdev.central_suporte.dto.response.UsuarioResponse;
import java.util.List;

public interface UsuarioService {

    void cadastrar(UsuarioRequest request);

    List<UsuarioResponse> listar();
}
