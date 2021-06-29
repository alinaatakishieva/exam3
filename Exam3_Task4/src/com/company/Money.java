package com.company;

public class Money extends AbstractSmthPaper {
    private Currency currency;
    private int nomination;

    public Money() {
    }

    public Money(Currency currency, int nomination) {
        this.currency = currency;
        this.nomination = nomination;
    }

    @Override
    public String toString() {
        return " деньги " + nomination + " " + currency + "\n";
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNomination() {
        return nomination;
    }

    public void setNomination(int nomination) {
        this.nomination = nomination;
    }

    @Override
    String tear() {
        return "Если порвалась купюра обратитесь в банк.";
    }

    @Override
    String lost() {
        return "Чттоб не потерять деньги положи их в кошелёк.";
    }
}
