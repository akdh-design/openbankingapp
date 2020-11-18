package com.example.OpenBankingApp.service;

import com.example.OpenBankingApp.entity.Transaction;
import com.example.OpenBankingApp.service.TransactionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {
    TransactionService transactionService = new TransactionService();

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testTransactionCount() {
        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());
    }

//    void findAllByAccountNumber() {
//        TransactionService transactionService = new TransactionService();
//        List<Transaction> transactions = transactionService.findAllByAccountNumber(123);
//
//        assertEquals(transactions.size(), 2, "Transactions not 1");
//    }
}