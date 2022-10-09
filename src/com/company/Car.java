package com.company;

public abstract class Car implements Printable{
    private String carBrand;
private double engineVolume;
private Color color;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }


    public Color getColor() {
        return color;
    }

    public Car(String carBrand, double engineVolume, Color color) {
        this.carBrand = carBrand;
        this.engineVolume = engineVolume;
        this.color = color;
    }


    public String getCarBrand() {
        return carBrand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
