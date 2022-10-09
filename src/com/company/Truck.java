package com.company;

public class Truck extends Car{
  private int bodyVolume;
  private int weight;

    public int getBodyVolume() {
        return bodyVolume;
    }

    public int getWeight() {
        return weight;
    }

    public Truck(String carBrand, double engineVolume,Color color, int bodyVolume, int weight) {
        super(carBrand, engineVolume, color);
        this.bodyVolume = bodyVolume;
        this.weight = weight;
    }


    @Override
    public  void print() {
        System.out.println("Car Brand: " + getCarBrand() );
        System.out.println("Engine volume: " + getEngineVolume() + " liters");
        System.out.println("Color: " + getColor());
        System.out.println("Body volume: " + getBodyVolume() + " liters");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println();
    }
}
