package br.com.carteiravirtual.controller.form;

import br.com.carteiravirtual.model.Lancamento;
import br.com.carteiravirtual.model.TipoLancamento;
import br.com.carteiravirtual.repository.LancamentoRepository;

public class LancamentoForm {

    private String data;
    private Double valor;
    private TipoLancamento tipoLancamento;
    private String descricao;

    public Lancamento converter(LancamentoRepository lancamentoRepository) {
        return new Lancamento(data, valor, tipoLancamento, descricao);
    }

    public String getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }

    public TipoLancamento getTipoLancamento() {
        return tipoLancamento;
    }

    public String getDescricao() {
        return descricao;
    }
}
