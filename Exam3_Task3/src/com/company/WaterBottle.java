package com.company;

public class WaterBottle extends SomethingCilindric{
    private Double volume;

    public WaterBottle() {
    }

    public WaterBottle(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Вода в бутылке " + volume + " л";
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
