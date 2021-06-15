package Car;

import Car.components.IEngine;

public class ElectricCar extends Car {

    private int battery;

    public ElectricCar(int price, String colour, IEngine Engine, int battery) {
        super(price, colour, Engine);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }


    public String start() {
        return "i'm an electric motor - hear me roar";
    }

    public void drive(int distance){
        this.battery -= distance;
    }
}
