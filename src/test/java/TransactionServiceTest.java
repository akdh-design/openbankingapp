import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAllByAccountNumber() {
        TransactionService transactionService = new TransactionService();
        List<Transaction> transactions = transactionService.findAllByAccountNumber("123");

        assertEquals(transactions.size(), 2, "Transactions not 1");
    }
}