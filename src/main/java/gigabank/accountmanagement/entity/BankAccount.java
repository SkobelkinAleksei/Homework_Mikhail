package gigabank.accountmanagement.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * Информация о банковском счете пользователя
 */
@Getter
@Setter
class BankAccount {
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
}


