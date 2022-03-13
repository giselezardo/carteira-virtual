package br.com.carteiravirtual.controller;

import br.com.carteiravirtual.controller.dto.LancamentoDto;
import br.com.carteiravirtual.controller.form.LancamentoForm;
import br.com.carteiravirtual.model.Lancamento;
import br.com.carteiravirtual.service.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.util.Optional;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    @Autowired
    private LancamentoService lancamentoService;

    @PostMapping
    @Transactional
    public ResponseEntity<String> inserirLancamento(@RequestBody LancamentoForm form) throws ParseException {
        LancamentoDto lancamentoDto = lancamentoService.salvarLancamento(form);
        return ResponseEntity.ok().body("Lançamento salvo com sucesso. ID lançamento: " + lancamentoDto.getIdLancamento());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deletarLancamento(@PathVariable Long id) {
        Optional<Lancamento> lancamento = lancamentoService.buscarPeloId(id);

        if (lancamento.isPresent()) {
            lancamentoService.deletarLancamento(id);
            return ResponseEntity.ok().body("Lançamento com id " + id + " deletado com sucesso");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Lançamento não encontrado");
    }

}
