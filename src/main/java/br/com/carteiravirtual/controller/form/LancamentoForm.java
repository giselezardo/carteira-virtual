package br.com.carteiravirtual.controller.form;

import br.com.carteiravirtual.model.Lancamento;
import br.com.carteiravirtual.model.TipoLancamento;
import br.com.carteiravirtual.repository.LancamentoRepository;

public class LancamentoForm {

    private String data;
    private Double valor;
    private Enum<TipoLancamento> tipoLancamento;
    private String descricao;

    public Lancamento converter(LancamentoRepository lancamentoRepository) {
        return new Lancamento(data, valor, tipoLancamento, descricao);
    }
}
