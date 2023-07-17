package br.com.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.model.Conta;
import br.com.banco.service.ContaService;

@RestController
@RequestMapping("/contas")
public class ContaController {
    
    @Autowired
    private final ContaService contaService;

    @Autowired
    public ContaController(ContaService contaService) {
        this.contaService = contaService;
    }

    @GetMapping("/{idConta}")
    public ResponseEntity<Conta> getConta(@PathVariable Long idConta) {
        Conta conta = contaService.getContaById(idConta);
        if (conta != null) {
            return ResponseEntity.ok(conta);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
    