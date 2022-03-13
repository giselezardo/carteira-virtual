package br.com.carteiravirtual.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    private String nomeCategoria;

    @OneToMany (mappedBy = "idLancamento")
    private List<Lancamento> lancamentos;

    public Categoria() {
    }

    public Categoria(Integer idCategoria, String nomeCategoria, List<Lancamento> lancamentos) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
        this.lancamentos = lancamentos;
    }

    public Categoria(String nomeCategoria, List<Lancamento> lancamentos) {
        this.nomeCategoria = nomeCategoria;
        this.lancamentos = lancamentos;
    }

    public Categoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(List<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }
}
