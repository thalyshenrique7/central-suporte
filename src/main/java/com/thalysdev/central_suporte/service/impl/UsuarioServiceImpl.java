package com.thalysdev.central_suporte.service.impl;

import com.thalysdev.central_suporte.adapter.UsuarioAdapter;
import com.thalysdev.central_suporte.dto.request.UsuarioRequest;
import com.thalysdev.central_suporte.dto.response.UsuarioResponse;
import com.thalysdev.central_suporte.entity.Usuario;
import com.thalysdev.central_suporte.repository.UsuarioRepository;
import com.thalysdev.central_suporte.service.UsuarioService;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioAdapter usuarioAdapter;

    public UsuarioServiceImpl(
            UsuarioRepository usuarioRepository,
            UsuarioAdapter usuarioAdapter
    ) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioAdapter = usuarioAdapter;
    }

    @Override
    @Transactional
    public void cadastrar(UsuarioRequest request) {
        Usuario usuario = new Usuario(
                request.nome(),
                request.email(),
                request.tipoUsuario()
        );

        usuarioRepository.save(usuario);
    }

    @Override
    public List<UsuarioResponse> listar() {
        return usuarioRepository.findAll()
                .stream()
                .map(usuarioAdapter::paraResponse)
                .toList();
    }
}
