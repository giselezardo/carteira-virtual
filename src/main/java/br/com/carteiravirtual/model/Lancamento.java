package br.com.carteiravirtual.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "lançamentos")
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLancamento;

    private String data;
    private Double valor;
    private TipoLancamento tipoLancamento;
    private String descricao;

    public Lancamento() {
    }

    public Lancamento(Long idLancamento, String data, Double valor, TipoLancamento tipoLancamento, String descricao) {
        this.idLancamento = idLancamento;
        this.data = data;
        this.valor = valor;
        this.tipoLancamento = tipoLancamento;
        this.descricao = descricao;
    }

    public Lancamento(String data, Double valor, TipoLancamento tipoLancamento, String descricao) {
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

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoLancamento getTipoLancamento() {
        return tipoLancamento;
    }

    public void setTipoLancamento(TipoLancamento tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
