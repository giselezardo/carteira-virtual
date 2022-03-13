package br.com.carteiravirtual.controller.dto;

import br.com.carteiravirtual.model.Lancamento;
import br.com.carteiravirtual.model.TipoLancamento;

public class LancamentoDto {

    private Long idLancamento;
    private String data;
    private Double valor;
    private TipoLancamento tipoLancamento;
    private String descricao;

    public LancamentoDto() {
    }

    public LancamentoDto(Lancamento lancamento) {
        idLancamento = lancamento.getIdLancamento();
        data = lancamento.getData();
        valor = lancamento.getValor();
        tipoLancamento = lancamento.getTipoLancamento();
        descricao = lancamento.getDescricao();
    }

    public LancamentoDto(Long idLancamento, String data, Double valor, TipoLancamento tipoLancamento, String descricao) {
        this.idLancamento = idLancamento;
        this.data = data;
        this.valor = valor;
        this.tipoLancamento = tipoLancamento;
        this.descricao = descricao;
    }

    public Long getIdLancamento() {
        return idLancamento;
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
