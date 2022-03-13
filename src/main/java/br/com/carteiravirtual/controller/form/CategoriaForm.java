package br.com.carteiravirtual.controller.form;

import br.com.carteiravirtual.model.Categoria;

public class CategoriaForm {

    private String nomeCategoria;

    public Categoria converterParaForm(Categoria categoria) {
        return new Categoria(this.nomeCategoria);
    }

    public Categoria getCategoria() {
        return new Categoria(nomeCategoria);
    }
    public String getNomeCategoria() {
        return nomeCategoria;
    }


}
