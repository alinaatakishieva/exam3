package com.company;

public class Phone implements Ringable{
    private PhoneModels models;
    private String color;

    public Phone(){}

    public Phone(PhoneModels models, String color) {
        this.models = models;
        this.color = color;
    }

    @Override
    public String ring() {
        return "Iphone melody";

    }

    @Override
    public String toString() {
        return "телефон: модель " + models + " цвет " + color;
    }

    public PhoneModels getModels() {
        return models;
    }

    public void setModels(PhoneModels models) {
        this.models = models;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

