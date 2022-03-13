package br.com.carteiravirtual.model;

public enum TipoLancamento {

    CREDITO("Crédito"),
    DEBITO("Débito");

    private final String descricao;

    TipoLancamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
