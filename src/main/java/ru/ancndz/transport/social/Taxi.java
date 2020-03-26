package ru.ancndz.transport.social;

import ru.ancndz.transport.auto.Car;

public class Taxi extends Car implements SocialInterface{
    private String companyName;
    private String comfortType;
    private int maxPassengers;
    private String actualDriver;

    public Taxi(int doorNum, boolean isGasEngine, String serialID, int year, double horsePowers, String color,
                String companyName, String comfortType, int maxPeopleCapacity, String actualDriver) {
        super(doorNum, isGasEngine, serialID, year, horsePowers, color);
        this.companyName = companyName;
        this.comfortType = comfortType;
        this.maxPassengers = maxPeopleCapacity;
        this.actualDriver = actualDriver;
    }

    @Override
    public String getActualInformation() {
        String carInfo = super.getActualInformation();

        return carInfo +
                "\n---Taxi info---" +
                "\nCompany name: " + this.companyName +
                "\nActual Driver: " + this.actualDriver +
                "\nComfort type: " + this.comfortType +
                "\nMax passengers: " + this.maxPassengers;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setActualDriver(String actualDriver) {
        this.actualDriver = actualDriver;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getComfortType() {
        return comfortType;
    }

    @Override
    public boolean isComfortForRetired() {
        return true;
    }

    public String getActualDriver() {
        return actualDriver;
    }
}
