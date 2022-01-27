package ee.bcs.bank.restbank;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AccountService {

    // TODO: loo teenus createExampleAccount() mis loob uue AccountDto objekti:
    //  account number = random account number
    //  firstName "John"
    //  lastName "Smith"
    //  balance 0
    //  locked false

    public AccountDto createExampleAccount() {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountNumber(createRandomAccountNumber());
        accountDto.setFirstName("Juss");
        accountDto.setLastName("Kolm");
        accountDto.setBalance(0);
        accountDto.setLocked(false);

        return accountDto;
    }

    private String createRandomAccountNumber() {
        //  Creates random account number between EE1000 -  EE9999
        Random random = new Random();
        return "EE" + (random.nextInt(9999) + 1000);
    }

    public boolean accountIdExists(List<AccountDto> accounts, int accountId) {
        for (AccountDto account : accounts) {
            if (account.getId() == accountId) {
                return true;
            }
        }

        return false;

    }

    public AccountDto getAccountById(List<AccountDto> accounts, int accountId) {
        //käime läbi kõik kontod accounts listsi ja paneme iga konto muutujasse 'account'
        for (AccountDto account : accounts) {
            // kui leiame konto mille id on võrdne accountId-ga
            if (account.getId() == accountId) {
                //siis tagastame selle konto
                return account;
            }
        }
        return null;
    }

    public boolean accountNumberExists(List<AccountDto> accounts, String receiverAccountNumber) {
        for (AccountDto account : accounts) {
            if (account.getAccountNumber().equals((receiverAccountNumber))) {
                return true;
            }
        }
        return false;
    }

    public AccountDto getAccountByNumber(List<AccountDto> accounts, String receiverAccountNumber) {

        for (AccountDto account : accounts) {
            if (account.getAccountNumber().equals((receiverAccountNumber))) {
                return account;
            }
        }
        return null;
    }
}
