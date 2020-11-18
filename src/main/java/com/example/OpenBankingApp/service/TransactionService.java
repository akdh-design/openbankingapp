package com.example.OpenBankingApp.service;

import com.example.OpenBankingApp.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TransactionService {

    private List<Transaction> transactions;



    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
        return List.of(
                new Transaction("credit", 1234567, "USD", 100.00, "acme", "acme.png")
        );
    }

}
