package Car;

import Car.components.Gearbox;
import Car.components.IEngine;
import Car.components.Tyre;

import java.util.ArrayList;

public abstract class Car {

    private int price;
    private String colour;
    private IEngine engine;
    private Tyre frontLeft;
    private Tyre frontRight;
    private Tyre rearLeft;
    private Tyre rearRight;
    private Gearbox gearbox;

    public Car(int price, String colour, IEngine engine, Gearbox gearbox, Tyre frontLeft, Tyre frontRight, Tyre rearLeft, Tyre rearRight){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.gearbox = gearbox;
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.rearLeft = rearLeft;
        this.rearRight = rearRight;
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

    public void reSpray(String colour){
        this.setColour(colour);
    }

    public abstract void drive(int distance);

    public int getTyreLife(Tyre tyre) {
        return tyre.getLife();
    }

    public void erodeTyres(int distance){
        frontLeft.reduceLife(distance);
        frontRight.reduceLife(distance);
        rearLeft.reduceLife(distance);
        rearRight.reduceLife(distance);
    }

    public void erodeTyreLeft(){
        frontLeft.reduceLife(1);
    }

    public void erodeTyreRight(){
        frontRight.reduceLife(1);
    }

    public void turn(String direction) {
        if (direction == "left") {
            this.erodeTyreLeft();
        } else this.erodeTyreRight();
    }
}
