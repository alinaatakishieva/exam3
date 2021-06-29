package com.company;

public class Main {

    public static void main(String[] args) {
        Me alina = new Me("Алина", 21, "учитель",new Clothes());
        Clothes jeans = new Clothes("джинсы", "черный", 'S', new LeftPocket(), new RightPocket());
        LeftPocket left = new LeftPocket(new Phone());
        Phone phone = new Phone(PhoneModels.IPHONE, "violet");
        RightPocket right = new RightPocket();
        Money money = new Money();
        Recipy recipy = new Recipy();

        System.out.println(alina + "\n" + jeans + "\n" + left+ phone+ "\n" + right);
        System.out.println("У телефона есть метод звонить");
        System.out.println(phone.ring());
        System.out.println("Нужно не забывать о том что ");
        System.out.println(money.lost());
        System.out.println(money.tear());
        System.out.println(recipy.lost());
        System.out.println(recipy.tear());

    }
}
