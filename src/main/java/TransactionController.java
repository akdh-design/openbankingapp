import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/")
public class TransactionController {

    @GetMapping(path = "/transactions",
    produces = {"application/json"})
    public ResponseEntity<List<Transaction>>
    getTransactions(@RequestParam(value = "accountNumber") String accountNumber) {

        TransactionService transactionService = new TransactionService();
        List<Transaction> transactions = transactionService.findAllByAccountNumber("123");

        return new ResponseEntity<List<Transaction>>(transactions, HttpStatus.OK);

    }
}
