package Car;

import Car.components.IEngine;

public abstract class Car implements IEngine {

    private int price;
    private String colour;
    IEngine Engine;

    public Car(int price, String colour, IEngine Engine){
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
