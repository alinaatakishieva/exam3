package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {
    static List<Person> people = new LinkedList<>();

    public static void main(String[] args) {
        checkThePresence(new Person("Atakishieva", "Alina", "Elmirovna"));
        checkThePresence(new Person("Atakishiev", "Timur", "Elmirovich"));
        checkThePresence(new Person("Atakishiev", "Timur", "Elmirovich"));
        checkThePresence(new Person("Atakishieva", "Alina", "Elmirovna"));

        for (Person check : people) {
            System.out.println(check);
        }
    }

    public static void checkThePresence(Person person) {
        try {
            if (people.contains(person)) {
                throw new PersonPresenceException(person.getSurname() + " " +
                        person.getName() + " " +
                        person.getOtchestvo() + " уже был добавлен в список");
            } else {
                people.add(person);
            }

        } catch (PersonPresenceException ex) {
            System.out.println(ex.getMessage());
        }
    }

}