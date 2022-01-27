package ee.bcs.bank.restbank;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class AccountDto {

    private int id;
    private String accountNumber;
    private String firstName;
    private String lastName;
    private Integer balance;
    private Boolean locked;

}
