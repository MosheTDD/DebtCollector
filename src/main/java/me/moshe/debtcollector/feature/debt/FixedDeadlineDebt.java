package me.moshe.debtcollector.feature.debt;

import me.border.utilities.utils.TimeUtils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FixedDeadlineDebt extends Debt{
    private LocalDateTime deadline;

    public FixedDeadlineDebt(double amount, String details, LocalDateTime date, LocalDateTime deadline) {
        super(amount, details, date, DebtType.DEADLINE);
        this.deadline = deadline;
    }

    public boolean isOver(LocalDateTime now){
        return now.until(deadline, ChronoUnit.MILLIS) < 1;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }
}
