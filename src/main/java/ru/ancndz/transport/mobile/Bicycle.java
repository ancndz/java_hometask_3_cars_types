package ru.ancndz.transport.mobile;

import ru.ancndz.transport.Vehicle;

public class Bicycle extends Vehicle {
    private String model;
    private String color;

    public Bicycle(String serialID, int year, String model, String color) {
        //нет нужды добавлять в конструктор количество дверей и тип двигателя
        super(0, false, serialID, year);
        this.model = model;
        this.color = color;
    }

    @Override
    public String getActualInformation() {
        String basicInfo = super.getActualInformation();

        return basicInfo +
                "\n---Bicycle info---" +
                "\nColor: " + this.color +
                "\nModel: " + this.model;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return this.color;
    }
}
