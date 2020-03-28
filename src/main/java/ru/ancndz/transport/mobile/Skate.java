package ru.ancndz.transport.mobile;

import ru.ancndz.transport.Vehicle;

public class Skate extends Vehicle {
    private String usualDistrict;
    private String color;

    public Skate(String serialID, int year, String usualDistrict, String color) {
        super(0, false, serialID, year);
        this.usualDistrict = usualDistrict;
        this.color = color;
    }

    @Override
    public String getActualInformation() {
        String basicInfo = super.getActualInformation();

        return basicInfo +
                "\n---Skate info---" +
                "\nColor: " + this.color +
                "\nUsual District: " + this.usualDistrict;
    }


    public String getUsualDistrict() {
        return usualDistrict;
    }

    public String getColor() {
        return color;
    }
}
