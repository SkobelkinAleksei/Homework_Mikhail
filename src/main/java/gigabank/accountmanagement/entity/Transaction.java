package gigabank.accountmanagement.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Comparator;

/**
 * Информация о совершенной банковской транзакции
 */
@Getter
@Setter

class Transaction {
    private String transactionId;
    private BigDecimal amount;

    public Transaction(String transactionId, BigDecimal amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
}

