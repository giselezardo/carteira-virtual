package br.com.carteiravirtual.model;

import javax.persistence.*;

@Entity(name = "lançamentos")
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLancamento;

    private String data;
    private Double valor;
    private TipoLancamento tipoLancamento;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA")
    private Categoria categoria;

    public Lancamento() {
    }

    public Lancamento(Long idLancamento, String data, Double valor, TipoLancamento tipoLancamento, String descricao, Categoria categoria) {
        this.idLancamento = idLancamento;
        this.data = data;
        this.valor = valor;
        this.tipoLancamento = tipoLancamento;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Lancamento(String data, Double valor, TipoLancamento tipoLancamento, String descricao, Categoria categoria) {
        this.data = data;
        this.valor = valor;
        this.tipoLancamento = tipoLancamento;
        this.descricao = descricao;
        this.categoria = categoria;
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

    public void setIdLancamento(Long idLancamento) {
        this.idLancamento = idLancamento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
