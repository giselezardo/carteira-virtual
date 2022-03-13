package br.com.carteiravirtual.controller.dto;

import br.com.carteiravirtual.model.Lancamento;
import br.com.carteiravirtual.model.TipoLancamento;

public class LancamentoDto {

    private Long idLancamento;
    private String data;
    private Double valor;
    private TipoLancamento tipoLancamento;
    private String descricao;
    private Integer idCategoria;

    public LancamentoDto() {
    }

    public LancamentoDto(Lancamento lancamento) {
        idLancamento = lancamento.getIdLancamento();
        data = lancamento.getData();
        valor = lancamento.getValor();
        tipoLancamento = lancamento.getTipoLancamento();
        descricao = lancamento.getDescricao();
        idCategoria = lancamento.getCategoria().getIdCategoria();
    }

    public LancamentoDto(Long idLancamento, String data, Double valor, TipoLancamento tipoLancamento, String descricao, Integer idCategoria) {
        this.idLancamento = idLancamento;
        this.data = data;
        this.valor = valor;
        this.tipoLancamento = tipoLancamento;
        this.descricao = descricao;
        this.idCategoria = idCategoria;
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

    public Integer getIdCategoria() {
        return idCategoria;
    }
}
