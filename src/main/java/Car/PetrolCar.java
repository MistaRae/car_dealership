package Car;

import Car.components.Gearbox;
import Car.components.IEngine;
import Car.components.Tyre;

public class PetrolCar extends Car {

    private int fuelTank;

    public PetrolCar(int price, String colour, IEngine engine, Gearbox gearbox, Tyre frontLeft, Tyre frontRight, Tyre rearLeft, Tyre rearRight, int fuelTank) {
        super(price, colour, engine,gearbox, frontLeft, frontRight, rearLeft, rearRight);
        this.fuelTank = fuelTank;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String start() {
        return "I'm a Petrol engine and I have officially started!!";
    }

    @Override
    public void drive(int distance) {
        this.fuelTank -= distance;

    }

}
