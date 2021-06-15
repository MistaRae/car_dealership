package Car;

import Car.components.IEngine;

public class ElectricCar extends Car {

    private int Battery;

    public ElectricCar(int price, String colour, IEngine Engine, int battery) {
        super(price, colour, Engine);
        Battery = battery;
    }

    public int getBattery() {
        return Battery;
    }

    public void setBattery(int battery) {
        Battery = battery;
    }


    public String start() {
        return "i'm an electric motor - hear me roar";
    }
}
