package com.company;

public class Folder extends SomethingFlat {
    private String color;

    public Folder() {
    }

    public Folder(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Папка. Цвет: " + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
