package com.company;

public class Main {

    public static void main(String[] args) {
createObject(2).print();
createObject(3).print();
createObject(4).print();
    }
    public static Car createObject(int number) {
        switch (number) {
            case 2:
                Sport_car sport_car = new Sport_car("Ferrari", 6.5, Color.YELLOW, 320, 6);
                return sport_car;
            case 3:
                Truck truck = new Truck("Volvo", 7.5, Color.GRAY, 10000, 6500);
                return truck;
            case 4:
                Limousine limousine = new Limousine("Ford", 6.5, Color.WHITE, 12, 13);
                return limousine;
            default:
                return null;
        }
    }
}

