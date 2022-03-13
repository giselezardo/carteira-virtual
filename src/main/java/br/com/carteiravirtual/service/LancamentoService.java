package br.com.carteiravirtual.service;

import br.com.carteiravirtual.controller.dto.LancamentoDto;
import br.com.carteiravirtual.controller.form.LancamentoForm;
import br.com.carteiravirtual.model.Lancamento;
import br.com.carteiravirtual.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public LancamentoDto salvaLancamento(LancamentoForm form){
        Lancamento lancamento = form.converter(lancamentoRepository);
        Lancamento lancamentoSalvo = lancamentoRepository.save(lancamento);
        return new LancamentoDto(lancamentoSalvo);
    }
}
