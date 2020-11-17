import java.util.*;
import java.util.stream.Collectors;

public class TransactionService {

    private List<Transaction> transactions;

    public TransactionService() {
        transactions = new ArrayList<Transaction>();

        Transaction transaction = new Transaction();
        transaction.accountNumber = "123";
        transaction.amount = 100;
        transaction.currency = "euro";
        transaction.merchantLogo = "logo";
        transaction.type = "credit";
        transactions.add(transaction);

        Transaction transaction2 = new Transaction();
        transaction2.accountNumber = "123";
        transaction2.amount = 100;
        transaction2.currency = "euro";
        transaction2.merchantLogo = "logo";
        transaction2.type = "credit";
        transactions.add(transaction2);

        Transaction transaction3 = new Transaction();
        transaction3.accountNumber = "1234";
        transaction3.amount = 100;
        transaction3.currency = "euro";
        transaction3.merchantLogo = "logo";
        transaction3.type = "credit";
        transactions.add(transaction3);
    }

    List<Transaction> findAllByAccountNumber(String accountNumber) {

        List<Transaction> result = transactions.stream()
                .filter(a -> Objects.equals(a.accountNumber, accountNumber))
                .collect(Collectors.toList());

        return result;
    }
}
