package br.com.banco.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.banco.model.Transfer;
import br.com.banco.repositories.TransferRepository;

@Service
public class TransferService {
    
    private final TransferRepository transferRepository;

    public TransferService(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    public List<Transfer> getAllTransfers() {
        return transferRepository.findAll();
    }

    public List<Transfer> getTransfersByAccount(String accountId) {
        return transferRepository.findByAccountId(accountId);
    }
}
