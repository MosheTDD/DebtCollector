package me.moshe.debtcollector.feature.debt;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class InterestDebt extends Debt{
    private final LocalDateTime deadline;
    private final double interest;
    private double interestAmount;
    private int interestTimes;
    private final double interestDuration;


    public InterestDebt(double amount, String details, LocalDateTime date, LocalDateTime deadLine, double interest, double interestDuration) {
        super(amount, details, date, DebtType.INTEREST);
        this.deadline = deadLine;
        this.interest = interest;
        this.interestDuration = interestDuration;
    }

    public boolean isOver(LocalDateTime now){
        return now.until(deadline, ChronoUnit.MILLIS) < 1;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    @Override
    public double getAmount() {
        return super.getAmount() + interestAmount;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }
}

