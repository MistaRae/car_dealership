package Car.components;

public class ElectricMotor implements IEngine{

    private int horsePower;
    private String manufacturer;


    public ElectricMotor(int horsePower, String manufacturer) {
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String start() {
        return "i'm an electric motor - hear me roar";
    }
}
