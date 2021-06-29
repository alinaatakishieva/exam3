package com.company;

public class RightPocket {

    Money money = new Money(Currency.KGS, 200);
    Recipy paper1 = new Recipy(Prescription.ANTIGRIPPIN);

    public Money getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "в правом кармане у меня " + money + paper1;
    }
}
