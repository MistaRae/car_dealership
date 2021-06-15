package Car;

import Car.components.IEngine;

public abstract class Car {

    private int price;
    private String colour;
    private IEngine engine;

    public Car(int price, String colour, IEngine engine){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
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
