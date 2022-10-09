package com.company;

public class Sport_car extends Car{
    private int maximum_speed;
    private int accelerationUpTo_100km_h ;

    public int getMaximum_speed() {
        return maximum_speed;
    }

    public int getAccelerationUpTo_100km_h() {
        return accelerationUpTo_100km_h;
    }
    public Sport_car(String carBrand, double engineVolume,Color color, int maximum_speed, int accelerationUpTo_100km_h) {
        super(carBrand, engineVolume, color);
        this.maximum_speed = maximum_speed;
        this.accelerationUpTo_100km_h = accelerationUpTo_100km_h;
    }

    @Override
    public void print() {
        System.out.println("Car Brand: " + getCarBrand());
        System.out.println("Engine volume: " + getEngineVolume() + " liters" );
        System.out.println("Color: " + getColor());
        System.out.println("Maximum speed: " + getMaximum_speed() + " km/h");
        System.out.println("Acceleration up to 100 km/h: " + getAccelerationUpTo_100km_h() + " seconds");
        System.out.println();

    }
}
