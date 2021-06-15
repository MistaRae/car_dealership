package Car;

import Car.components.Gearbox;
import Car.components.IEngine;
import Car.components.Tyre;

public class ElectricCar extends Car {

    private int battery;

    public ElectricCar(int price, String colour, IEngine engine, Gearbox gearbox, Tyre frontLeft, Tyre frontRight, Tyre rearLeft, Tyre rearRight, int battery) {
        super(price, colour, engine, gearbox, frontLeft, frontRight, rearLeft, rearRight);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public void drive(int distance){
        double economy = this.getGearboxEconomyFromEnum();
        this.battery -= distance * economy;
        this.erodeTyres(distance);
    }

    public String start() {
        return "i'm an electric motor - hear me roar";
    }

}
