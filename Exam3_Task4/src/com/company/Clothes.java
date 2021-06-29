package com.company;

public class Clothes {
    private String name;
    private String color;
    private char size;
    private LeftPocket left;
    private RightPocket right;

    public Clothes() {
    }

    public Clothes(String name, String color, char size, LeftPocket left, RightPocket right) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.left = left;
        this.right = right;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public LeftPocket getLeft() {
        return left;
    }

    public void setLeft(LeftPocket left) {
        this.left = left;
    }

    public RightPocket getRight() {
        return right;
    }

    public void setRight(RightPocket right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "я вам расскажу что у меня в карманах. \n" +
                name + " " +
                " цвет: "+ color +
                " размер: " + size ;
    }
}
