package com.company;

public class LeftPocket {
    private Phone phone;

    public LeftPocket(){}

    public LeftPocket(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "в левом кармане у меня лежит " ;
    }
}
