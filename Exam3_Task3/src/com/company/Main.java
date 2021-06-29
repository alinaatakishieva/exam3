package com.company;

public class Main {

    public static void main(String[] args) {
        Backpack backpack1 = new Backpack(" Синий ");
        Backpack backpack2 = new Backpack(" Черный ");
        Backpack backpack3 = new Backpack(" Желтый ");

        fillBackpack1(backpack1);
        System.out.println(backpack1);

        fillBackpack2(backpack2);
        System.out.println(backpack2);

        fillBackpack3(backpack3);
        System.out.println(backpack3);

    }

    public static void fillBackpack1(Backpack backpack) {
        int countApples = 0;
        for (int i = 0; i < 20; i++) {
            backpack.addRoundThings(new Apple("Апорт"));
            countApples++;
        }
        System.out.println(countApples + " Яблок");
        backpack.addFlatThings(new Book("Код да Винчи", "Дэн Браун"));
        backpack.addCylindricalThings(new Coca_Cola(0.5));

    }

    public static void fillBackpack2(Backpack backpack) {
        int countTennisBalls = 0;
        for (int i = 0; i < 50; i++) {
            backpack.addRoundThings(new TennisBall("Ярко зеленый "));
            countTennisBalls++;
        }
        System.out.println(countTennisBalls + "Теннисных мячей");
        backpack.addFlatThings(new Folder("Красный"));
        backpack.addCylindricalThings(new WaterBottle(0.5));

    }

    public static void fillBackpack3(Backpack backpack) {
        int countApples = 0;
        int countTennisBalls = 0;
        for (int i = 0; i < 10; i++) {
            backpack.addRoundThings(new Apple(" Семерянка "));
            countApples++;
        }
        System.out.println(countApples + " Яблок");

        for (int i = 0; i < 3; i++) {
            backpack.addRoundThings(new TennisBall(" Черный "));
            countTennisBalls++;
        }
        System.out.println(countTennisBalls + " Теннисных мячей");

        backpack.addFlatThings(new Folder("Оранжевый"));
        backpack.addCylindricalThings(new Coca_Cola(1.0));

    }
}
