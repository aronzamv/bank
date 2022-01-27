package ee.bcs.bank.restbank;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    // TODO: loo teenus addAccountToBank() mis lisab uue konto bank accounts'i alla
    //  enne seda võta bank alt järgmine account id ja lisa see ka kontole
    //  ära unusta siis pärast seda accountIdCount'id suurendada
    public RequestResult addAccountToBank(Bank bank, AccountDto accountDto) {

        int accountId = bank.getAccountIdCount();
        accountDto.setId(accountId);
        accountDto.setBalance(0);
        accountDto.setLocked(false);
        bank.addAccountToAccounts(accountDto);
        bank.incrementAccountId();

        RequestResult requestResult = new RequestResult();
        requestResult.setAccountId(accountDto.getId());

        //todo: kontrolli, kas konto on juba olemas, kui jah, lisa vastav error.
        requestResult.setMessage("Added new account.");
        return requestResult;

    }


    // TODO: loo teenus addTransaction() mis lisab uue tehingu bank transactions'i alla
    //  enne seda võta bank alt järgmine transactionIdCount id ja lisa see ka tehingule
    //  ära unusta siis pärast seda transactionIdCount'id suurendada

}
