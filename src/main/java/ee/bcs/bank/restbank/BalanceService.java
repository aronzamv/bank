package ee.bcs.bank.restbank;

import org.springframework.stereotype.Service;

@Service
public class BalanceService {

    public boolean enoughMoneyOnAccount(Integer balance, Integer amount) {
            return balance >= amount;
    }
}
