package exercicio22_exceções.entities;

import exercicio22_exceções.exceptions.BusinessExceptions;

public class Account {
    private Integer number;
    private String name;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Double balance, String name, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.name = name;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > withdrawLimit) {
            throw new BusinessExceptions("Withdraw error: The amount exceed the withdraw limit.");
        }
        if (amount > getBalance()) {
            throw new BusinessExceptions("Withdraw error: Not enough balance.");
        }
    }
}
