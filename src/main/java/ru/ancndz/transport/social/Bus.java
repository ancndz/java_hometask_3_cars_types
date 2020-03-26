package ru.ancndz.transport.social;

import ru.ancndz.transport.auto.Wagon;

public class Bus extends Wagon implements SocialInterface{
    private int maxPassengers;
    private boolean isComfortForRetired;
    private String companyName;
    private String actualDriver;

    public Bus(int doorNum, boolean isGasEngine, String serialID, int year, double maxCapacityKG,
               double height, boolean isTrailer, int maxPeopleCapacity, boolean isComfortForRetired,
               String companyName, String actualDriver) {
        super(doorNum, isGasEngine, serialID, year, maxCapacityKG, height, isTrailer);
        this.maxPassengers = maxPeopleCapacity;
        this.isComfortForRetired = isComfortForRetired;
        this.companyName = companyName;
        this.actualDriver = actualDriver;
    }

    @Override
    public String getActualInformation() {
        String wagonInfo = super.getActualInformation();

        return wagonInfo +
                "\n--Bus info---" +
                "\nCompany name: " + this.companyName +
                "\nActual driver: " + this.actualDriver +
                "\nMax passengers: " + this.maxPassengers +
                "\nIs comfort for retired? " + this.isComfortForRetired;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public String getComfortType() {
        return "Large";
    }

    @Override
    public boolean isComfortForRetired() {
        return isComfortForRetired;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getActualDriver() {
        return actualDriver;
    }
}
