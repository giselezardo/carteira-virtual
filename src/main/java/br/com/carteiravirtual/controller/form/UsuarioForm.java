package br.com.carteiravirtual.controller.form;

import br.com.carteiravirtual.model.Usuario;
import br.com.carteiravirtual.repository.UsuarioRepository;

import java.util.Optional;

public class UsuarioForm {

    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario converter(UsuarioRepository usuarioRepository) {
        Optional<Usuario> usuario = usuarioRepository.findByEmail(email);
        return new Usuario(email, senha);

    }
}
