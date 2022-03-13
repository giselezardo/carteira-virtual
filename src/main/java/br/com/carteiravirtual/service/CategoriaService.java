package br.com.carteiravirtual.service;

import br.com.carteiravirtual.controller.dto.CategoriaDto;
import br.com.carteiravirtual.controller.form.CategoriaForm;
import br.com.carteiravirtual.model.Categoria;
import br.com.carteiravirtual.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public CategoriaDto salvarCategoria(CategoriaForm form) {
        Categoria categoria = form.getCategoria();
        Categoria categoriaNova = categoriaRepository.save(categoria);
        return new CategoriaDto(categoriaNova);
    }

    public Optional<Categoria> buscarPeloId(Integer id) {
        return categoriaRepository.findById(id);
    }

    public void deletarLancamento(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
