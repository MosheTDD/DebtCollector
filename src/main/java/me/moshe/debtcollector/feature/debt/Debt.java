package me.moshe.debtcollector.feature.debt;

import java.time.LocalDateTime;

public abstract class Debt {
    private final double amount;
    private final String details;
    private final LocalDateTime date;
    private final DebtType debtType;
    private boolean completed = false;

    public Debt(double amount, String details, LocalDateTime date, DebtType debtType){
        this.amount = amount;
        this.details = details;
        this.date = date;
        this.debtType = debtType;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void complete(){
        completed = true;
    }

    public DebtType getDebtType() {
        return debtType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }
}
