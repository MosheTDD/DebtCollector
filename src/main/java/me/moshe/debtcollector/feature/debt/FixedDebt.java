package me.moshe.debtcollector.feature.debt;

import java.time.LocalDateTime;

public class FixedDebt extends Debt{
    public FixedDebt(double amount, String details, LocalDateTime date) {
        super(amount, details, date, DebtType.FIXED);
    }
}
