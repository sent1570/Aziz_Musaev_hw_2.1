package com.company;

public class Limousine extends Car{
    private int lenght ;
    private int numberOfSeats;

    public int getLenght() {
        return lenght;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Limousine(String carBrand, double engineVolume,Color color, int lenght, int numberOfSeats) {
        super(carBrand, engineVolume, color);
        this.lenght = lenght;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void print() {
        System.out.println("Car Brand: " + getCarBrand());
        System.out.println("Engine volume: " + getEngineVolume() + " liters");
        System.out.println("Color: " + getColor());
        System.out.println("Lenght: " + getLenght() + " Meters");
        System.out.println("Number of seats: " + getNumberOfSeats());
        System.out.println();
    }
}
