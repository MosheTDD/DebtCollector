package me.moshe.debtcollector.feature;

import me.moshe.debtcollector.feature.debt.Debt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Debtor implements Serializable {

    private final String name;
    private final List<Debt> debts = new ArrayList<>();

    public Debtor(String name) {
        this.name = name;
    }

    public void addDebt(Debt debt){
        debts.add(debt);
    }

    public String getName() {
        return name;
    }
}
