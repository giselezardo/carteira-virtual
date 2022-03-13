package br.com.carteiravirtual.controller;

import br.com.carteiravirtual.controller.dto.CategoriaDto;
import br.com.carteiravirtual.controller.form.CategoriaForm;
import br.com.carteiravirtual.model.Categoria;
import br.com.carteiravirtual.model.Lancamento;
import br.com.carteiravirtual.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping
    @Transactional
    public ResponseEntity<CategoriaDto> cadastrarCategoria(@RequestBody CategoriaForm categoriaForm, UriComponentsBuilder uriBuilder){
        CategoriaDto categoriaDto = categoriaService.salvarCategoria(categoriaForm);
        URI uri = uriBuilder.path("/categoria/{id}").buildAndExpand(categoriaDto.getIdCategoria()).toUri();
        return ResponseEntity.created(uri).body(categoriaDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deletarCategoria(@PathVariable Integer id) {
        Optional<Categoria> categoria = categoriaService.buscarPeloId(id);

        if (categoria.isPresent()) {
            categoriaService.deletarLancamento(id);
            return ResponseEntity.ok().body("Categoria " + categoria.get().getNomeCategoria() + " deletada com sucesso");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Categoria não encontrada");
    }
}
