package dealership;

import Car.Car;
import customer.Customer;

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

    public void addToStock(Car car){
        this.stock.add(car);
    }

    public void sellCar(Car car, Customer customer ) {
        this.till += car.getPrice();
        this.stock.remove(car);
        customer.buyCar(car);

    }

    public void buyCar(Car car) {
        if (this.till >= car.getPrice()){
        this.till -= car.getPrice();
        this.stock.add(car);
        } else return;

    }

    public void addToTill(int income) {
        this.till += income;
    }

    public void buyCarFromCustomer(Car car, Customer customer) {
        if (this.till >= car.getPrice()){
            this.till -= car.getPrice();
            customer.sellCar(car);
            this.stock.add(car);
        } else return;
    }
}
