package br.com.projeto.spring.crud.projetocrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.spring.crud.projetocrud.entities.Usuario;
import br.com.projeto.spring.crud.projetocrud.exceptions.DataNotFoundException;
import br.com.projeto.spring.crud.projetocrud.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public void gravar(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Usuario consultar(Long codigoUsuario){
        return usuarioRepository.findById(codigoUsuario)
        .orElseThrow(() ->
        new DataNotFoundException("Usuario não encontrado"));
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public void excluir(long codigoUsuario) {
        usuarioRepository.deleteById(codigoUsuario);
    }
}
