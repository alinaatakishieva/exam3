package com.company;

public class TennisBall extends SomethingRound {
    private String color;

    public TennisBall() {
    }

    public TennisBall(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Обычные теннисные мячи. Цвет: " + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
