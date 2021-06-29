package com.company;

import java.util.Objects;

public class Person {
    private String surname;
    private String name;
    private String otchestvo;

    public Person(){}

    public Person(String surname, String name, String otchestvo) {
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + otchestvo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, otchestvo);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this.hashCode() == otherObject.hashCode())
            return true;
        if (getClass() != otherObject.getClass())
            return false;
        Person person = (Person) otherObject;
        return Objects.equals(surname, person.surname) &&
                Objects.equals(name, person.name) &&
                Objects.equals(otchestvo, person.otchestvo);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }
}
