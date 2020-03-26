package ru.ancndz.transport;

public class Vehicle {
    private int doorNum;
    private boolean isGasEngine;

    private String serialID;
    private int year;

    public Vehicle(int doorNum, boolean isGasEngine, String serialID, int year) {
        this.doorNum = doorNum;
        this.isGasEngine = isGasEngine;
        this.serialID = serialID;
        this.year = year;
    }

    public String getActualInformation() {
        return "---Basic information---" +
                "\nRegistred number: " + this.serialID +
                "\nYear: " + this.year +
                "\nIs gasoline engine? " + this.isGasEngine +
                "\nDoors number: " + this.doorNum;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public boolean isGasEngine() {
        return isGasEngine;
    }

    public String getSerialID() {
        return serialID;
    }

    public int getYear() {
        return year;
    }
}
