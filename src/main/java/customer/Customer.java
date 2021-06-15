package customer;

import Car.Car;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Car> ownedCars;
    private int wallet;

    public Customer(ArrayList<Car> ownedCars, int wallet) {
        this.ownedCars = ownedCars;
        this.wallet = wallet;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public int getWallet() {
        return wallet;
    }

    public int countOwnedCars() {
        return ownedCars.size();
    }

    public void buyCar(Car car) {
        if (car.getPrice() > this.wallet) {
            return;
        } else
        this.wallet -= car.getPrice();
        ownedCars.add(car);
    }

    public void setWallet(int newBalance) {
        this.wallet = newBalance;
    }
}
