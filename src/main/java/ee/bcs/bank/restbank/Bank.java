package ee.bcs.bank.restbank;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Bank {
    private List<AccountDto> accounts = new ArrayList<>();
    private int accountIdCount = 1;

    private List<TransactionDto> transactions = new ArrayList<>();
    private int  transactionIdCount = 1;

    public void incrementAccountId() {
        accountIdCount++;
    }

    public void addAccountToAccounts(AccountDto accountDto) {
        accounts.add(accountDto);

    }

    public void addTransactionToTransactions(TransactionDto transactionDto) {
        transactions.add(transactionDto);
    }

    public void incrementTransactionId() {
        transactionIdCount++;
    }
}
