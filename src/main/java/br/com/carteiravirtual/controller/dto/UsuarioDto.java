package br.com.carteiravirtual.controller.dto;

public class UsuarioDto {

    private String email;
    private String senha;


    public UsuarioDto(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }
}
