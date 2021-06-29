package com.company;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private String color;
    private List<SomethingFlat> flatThings = new ArrayList<>();
    private List<SomethingRound> roundThings = new ArrayList<>();
    private List<SomethingCilindric> cylindricalThings = new ArrayList<>();

    public Backpack() {
    }

    public Backpack(String color) {
        this.color = color;
    }

    public Backpack(List<SomethingFlat> flatThings, List<SomethingRound> roundThings, List<SomethingCilindric> cilindricList) {

        this.flatThings = flatThings;
        this.roundThings = roundThings;
        this.cylindricalThings = cilindricList;
    }

    public void addFlatThings(SomethingFlat flat) {
        flatThings.add(flat);
    }

    public void addRoundThings(SomethingRound round) {
        roundThings.add(round);
    }

    public void addCylindricalThings(SomethingCilindric cylindrical) {
        cylindricalThings.add(cylindrical);
    }


    @Override
    public String toString() {
        return "B" + color + "рюкзаке лежит: " + '\n' +
                "что-то плоское -> " + flatThings + '\n'+
                "что-то круглое -> " + roundThings + '\n'+
                "что-то цилиндрическое -> " + cylindricalThings;

    }

    public List<SomethingFlat> getFlatThings() {
        return flatThings;
    }

    public void setFlatThings(List<SomethingFlat> flatThings) {
        this.flatThings = flatThings;
    }

    public List<SomethingRound> getRoundThings() {
        return roundThings;
    }

    public void setRoundThings(List<SomethingRound> roundThings) {
        this.roundThings = roundThings;
    }

    public List<SomethingCilindric> getCylindricalThings() {
        return cylindricalThings;
    }

    public void setCylindricalThings(List<SomethingCilindric> cylindricalThings) {
        this.cylindricalThings = cylindricalThings;
    }
}
