package br.com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.model.Transfer;
import br.com.banco.service.TransferService;

@RestController
@RequestMapping("/transfers")
public class TransferController {
    
    @Autowired
    private final TransferService transferService;

    @Autowired
    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @GetMapping
    public List<Transfer> getAllTransfers() {
        return transferService.getAllTransfers();
    }

    @GetMapping("/{accountId}")
    public List<Transfer> getTransfersByAccount(@PathVariable String accountId) {
        return transferService.getTransfersByAccount(accountId);
    }
}
