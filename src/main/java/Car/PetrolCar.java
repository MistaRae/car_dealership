package Car;

public class PetrolCar extends Car {

    private int fuelTank;


    public PetrolCar(int Price, String colour, int fuelTank) {
        super(Price, colour);
        this.fuelTank = fuelTank;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }
}
