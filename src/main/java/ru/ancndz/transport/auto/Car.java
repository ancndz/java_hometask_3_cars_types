package ru.ancndz.transport.auto;

import ru.ancndz.transport.Vehicle;

public class Car extends Vehicle {
    private double horsePowers;
    private String color;

    public Car(int doorNum, boolean isGasEngine, String serialID, int year, double horsePowers, String color) {
        super(doorNum, isGasEngine, serialID, year);
        this.color = color;
        this.horsePowers = horsePowers;
    }

    @Override
    public String getActualInformation() {
        String basicInfo = super.getActualInformation();

        return basicInfo +
                "\n---Car info---" +
                "\nHorse powers: " + this.horsePowers +
                "\nColor: " + this.color;
    }

    public double getHorsePowers() {
        return horsePowers;
    }

    public String getColor() {
        return color;
    }
}
