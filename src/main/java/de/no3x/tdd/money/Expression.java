package de.no3x.tdd.money;

public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
}
