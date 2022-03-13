package br.com.carteiravirtual.service;

import br.com.carteiravirtual.controller.dto.LancamentoDto;
import br.com.carteiravirtual.controller.form.LancamentoForm;
import br.com.carteiravirtual.model.Lancamento;
import br.com.carteiravirtual.repository.CategoriaRepository;
import br.com.carteiravirtual.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public LancamentoDto salvarLancamento(LancamentoForm form) throws ParseException {
        Lancamento lancamento = form.converter(lancamentoRepository, categoriaRepository);
        lancamento.setData(converterData(lancamento));
        Lancamento lancamentoSalvo = lancamentoRepository.save(lancamento);
        return new LancamentoDto(lancamentoSalvo);
    }

    public String converterData(Lancamento lancamento) throws ParseException {
        SimpleDateFormat formatoDataDeEntrada = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoDataDeEntrada.parse(lancamento.getData());
        SimpleDateFormat formatoDataFinal = new SimpleDateFormat("yyyy-MM-dd");
        return formatoDataFinal.format(data);
    }

    public Optional<Lancamento> buscarPeloId(Long id) {
        return lancamentoRepository.findById(id);
    }

    public void deletarLancamento(Long id) {
        lancamentoRepository.deleteById(id);
    }
}
