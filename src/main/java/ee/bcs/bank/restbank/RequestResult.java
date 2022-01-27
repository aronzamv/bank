package ee.bcs.bank.restbank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestResult {
    private int accountId;
    private int transactionId;
    private String message;
    private String error;
}
