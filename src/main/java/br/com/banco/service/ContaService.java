package br.com.banco.service;

import org.springframework.stereotype.Service;

import br.com.banco.model.Conta;
import br.com.banco.repositories.ContaRepository;

@Service
public class ContaService {
    private final ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public Conta getContaById(Long idConta) {
        return contaRepository.findById(idConta).orElse(null);
    }
}
