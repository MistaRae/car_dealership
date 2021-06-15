package Car;

import Car.components.IEngine;

public class PetrolCar extends Car {

    private int fuelTank;


    public PetrolCar(int price, String colour,IEngine petrolEngine, int fuelTank) {
        super(price, colour, petrolEngine);
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

}
