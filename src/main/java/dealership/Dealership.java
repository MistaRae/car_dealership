package dealership;

import Car.Car;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> stock;
    private int till;

    public Dealership(ArrayList stock, int till) {
        this.stock = stock;
        this.till = till;
    }

    public ArrayList getStock() {
        return stock;
    }

    public int getTill() {
        return till;
    }

    public int countStock() {
        return stock.size();
    }
}
