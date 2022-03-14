package br.com.carteiravirtual.repository;

import br.com.carteiravirtual.model.Categoria;
import br.com.carteiravirtual.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

    List<Lancamento> findByCategoria(Optional<Categoria> categoria);
}
