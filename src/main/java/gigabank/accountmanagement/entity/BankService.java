package gigabank.accountmanagement.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class BankService {
    private List<BankAccount> accounts = new ArrayList<>();

    // Метод для создания нового банковского аккаунта
    public Boolean createNewBankAccountForUser(User user, BankAccount bankAccount) {
        if (user == null || bankAccount == null) {
            return false;
        }
        accounts.add(bankAccount);
        return true;
    }

    // Метод для удаления банковского аккаунта
    public Boolean deleteUserBankAccount(User user, BankAccount bankAccount) {
        if (user == null || bankAccount == null) {
            return false;
        }
        return accounts.remove(bankAccount);
    }

    // Метод для пополнения банковского аккаунта
    public void replenishmentBankAccount(BankAccount bankAccount, BigDecimal sum, Transaction transaction) {
        ?????????????

    }

    // Метод для оплаты счета с банковского аккаунта
    public Boolean paymentFromBankAccount(BankAccount bankAccount, Transaction transaction) {
        if (bankAccount != null && transaction != null &&
                bankAccount.getBalance().compareTo(transaction.getAmount()) >= 0) {
            bankAccount.withdraw(transaction.getAmount());
            return true;
        }
        return false;
    }

    // Метод для перевода средств между банковскими счетами
    public Boolean paymentFromAndToAccount(BankAccount fromAccount, BankAccount toAccount, BigDecimal sum) {
        if (fromAccount != null && toAccount != null &&
                fromAccount.getBalance().compareTo(sum) >= 0) {
            ?????????????
        }
        return false;
    }
}