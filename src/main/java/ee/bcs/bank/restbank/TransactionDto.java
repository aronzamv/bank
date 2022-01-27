package ee.bcs.bank.restbank;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TransactionDto {
    private int id;
    private int accountId;
    private String senderAccountNumber;
    private String receiverAccountNumber;
    private Integer amount;
    private Integer balance;
    private LocalDateTime localDateTime;
    private Character transactionType;

}
