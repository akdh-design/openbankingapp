import lombok.Data;

@Data
public class Transaction {
    String type;
    String accountNumber;
    String currency;
    Integer amount;
    String merchantName;
    String merchantLogo;
}
