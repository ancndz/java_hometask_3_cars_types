package ru.ancndz.transport.auto;

import ru.ancndz.transport.Vehicle;

public class Wagon extends Vehicle {
    private double maxCapacityKG;
    private double height;
    private boolean isTrailer;

    public Wagon(int doorNum, boolean isGasEngine, String serialID, int year, double maxCapacityKG, double height, boolean isTrailer) {
        super(doorNum, isGasEngine, serialID, year);
        this.maxCapacityKG = maxCapacityKG;
        this.height = height;
        this.isTrailer = isTrailer;
    }

    @Override
    public String getActualInformation() {
        String basicInfo = super.getActualInformation();

        return basicInfo +
                "\n---Wagon info---" +
                "\nMax capacity (kg): " + this.maxCapacityKG +
                "\nHeight: " + this.height +
                "\nIs trailer? " + this.isTrailer;
    }

    public double getMaxCapacityKG() {
        return maxCapacityKG;
    }

    public double getHeight() {
        return height;
    }

    public boolean isTrailer() {
        return isTrailer;
    }
}
