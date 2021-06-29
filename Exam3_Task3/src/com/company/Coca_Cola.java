package com.company;

public class Coca_Cola extends SomethingCilindric{
    private Double volume;

    public Coca_Cola() {
    }

    public Coca_Cola(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Кола в бутылке " + volume + " л";
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}

