package br.com.carteiravirtual.controller;

import br.com.carteiravirtual.model.Usuario;
import br.com.carteiravirtual.repository.UsuarioRepository;
import br.com.carteiravirtual.controller.dto.UsuarioDto;
import br.com.carteiravirtual.controller.form.UsuarioForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<UsuarioDto> cadastroUsuario(@RequestBody UsuarioForm form){
        Usuario usuario = form.converter(usuarioRepository);
        usuarioRepository.save(usuario);
        return ResponseEntity.ok().body(new UsuarioDto(usuario.getEmail()));
    }

}
