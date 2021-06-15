package Car;

public abstract class Car {

    private int price;
    private String colour;

    public Car(int Price, String colour){
        this.price = price;
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
