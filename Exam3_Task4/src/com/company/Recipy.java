package com.company;

public class Recipy extends AbstractSmthPaper{
    private Prescription prescription;

    public Recipy(){}

    public Recipy(Prescription prescription) {
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        return "рецепт на лекарство " + prescription ;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    @Override
    String tear() {
        return "Если не бережно относиться к рецепту для лекарства, он может порваться.";
    }

    @Override
    String lost() {
        return "не клади куда попало, бумажка может потеряться";
    }
}
