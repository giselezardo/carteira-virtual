package br.com.carteiravirtual.controller.dto;

import br.com.carteiravirtual.model.Categoria;

public class CategoriaDto {

    private Integer idCategoria;
    private String nomeCategoria;

    public CategoriaDto(Categoria categoria) {
        this.idCategoria = categoria.getIdCategoria();
        this.nomeCategoria = categoria.getNomeCategoria();
    }

    public CategoriaDto() {
    }

    public CategoriaDto(Integer idCategoria, String nomeCategoria) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }
}
