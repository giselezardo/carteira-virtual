package br.com.carteiravirtual.controller.form;

import br.com.carteiravirtual.model.Categoria;
import br.com.carteiravirtual.model.Lancamento;
import br.com.carteiravirtual.model.TipoLancamento;
import br.com.carteiravirtual.repository.CategoriaRepository;
import br.com.carteiravirtual.repository.LancamentoRepository;

public class LancamentoForm {

    private String data;
    private Double valor;
    private TipoLancamento tipoLancamento;
    private String descricao;
    private Integer idCategoria;

    public Lancamento converter(LancamentoRepository lancamentoRepository, CategoriaRepository categoriaRepository) {
        Categoria categoria = categoriaRepository.findById(idCategoria).get();
        return new Lancamento(data, valor, tipoLancamento, descricao, categoria);
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
