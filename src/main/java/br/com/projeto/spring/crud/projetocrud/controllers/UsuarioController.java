package br.com.projeto.spring.crud.projetocrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.projeto.spring.crud.projetocrud.entities.Usuario;
import br.com.projeto.spring.crud.projetocrud.services.UsuarioService;
import jakarta.validation.Valid;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping 
    public void inserir(@RequestBody @Valid Usuario usuario) {
        usuarioService.gravar(usuario);
    }

    @PutMapping
    public void alterar(@RequestBody @Valid Usuario usuario) {
        usuarioService.gravar(usuario);
    }
    
    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    @GetMapping("/{codigoUsuario}")
    public Usuario consultar(@PathVariable Long codigoUsuario) {
        return usuarioService.consultar(codigoUsuario);
    }

    @DeleteMapping("/{codigoUsuario}")
    public void excluir(@PathVariable Long codigoUsuario) {
        usuarioService.excluir(codigoUsuario);
    }
}
