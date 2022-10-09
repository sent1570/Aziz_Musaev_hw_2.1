package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>(List.of(1,2,3));
        Iterator<Integer> itr = a.iterator();
        while (itr.hasNext()) {
            Integer element = itr.next();
            System.out.println(element);
        }
        System.out.println("\n"+a.get(0));
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

