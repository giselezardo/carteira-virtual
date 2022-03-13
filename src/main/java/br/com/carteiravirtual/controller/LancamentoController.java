package br.com.carteiravirtual.controller;

import br.com.carteiravirtual.controller.dto.LancamentoDto;
import br.com.carteiravirtual.controller.form.LancamentoForm;
import br.com.carteiravirtual.service.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    @Autowired
    private LancamentoService lancamentoService;

    @PostMapping
    @Transactional
    public ResponseEntity<String> insereLancamento(@RequestBody LancamentoForm form){
        LancamentoDto lancamentoDto = lancamentoService.salvaLancamento(form);
        return ResponseEntity.ok().body("Lançamento salvo com sucesso. ID lançamento: " + lancamentoDto.getIdLancamento());
    }

}
