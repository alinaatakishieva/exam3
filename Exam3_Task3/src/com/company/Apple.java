package com.company;

public class Apple extends SomethingRound{
    private String type;

    public Apple() {
    }

    public Apple(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "яблоко сорта " + type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
