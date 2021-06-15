import Car.Car;
import Car.ElectricCar;
import Car.PetrolCar;
import Car.components.ElectricMotor;
import Car.components.Gearbox;
import Car.components.PetrolEngine;
import Car.components.Tyre;
import customer.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDealership {

    private Dealership ccClark;
    private ArrayList<Car> stock;
    private Customer mark;
    private ArrayList<Car> ownedCars;
    private ElectricCar tesla;
    private PetrolCar mercedes;
    private ElectricMotor electricMotor;
    private PetrolEngine petrolEngine;
    private Tyre frontLeft;
    private Tyre frontRight;
    private Tyre rearLeft;
    private Tyre rearRight;


    @Before
    public void setUp() {
        stock = new ArrayList<>();
        ccClark = new Dealership(stock, 0);
        frontLeft = new Tyre(100);
        frontRight = new Tyre(100);
        rearLeft = new Tyre(100);
        rearRight = new Tyre(100);
        electricMotor = new ElectricMotor(150, "Tesla");
        tesla = new ElectricCar(10000, "blue", electricMotor, Gearbox.AUTOMATIC, frontLeft, frontRight, rearLeft, rearRight, 250);
        petrolEngine = new PetrolEngine(150, "Mercedes");
        mercedes = new PetrolCar(1000, "white", petrolEngine, Gearbox.AUTOMATIC, frontLeft, frontRight, rearLeft, rearRight, 200);
        ownedCars = new ArrayList<>();
        mark = new Customer(ownedCars, 11000);

    }

    @Test
    public void dealershipStartsWithEmptyStock(){
        assertEquals(0,ccClark.countStock());
    }

    @Test
    public void dealershipStartsWithEmptyTill(){
        assertEquals(0, ccClark.getTill());
    }

    @Test
    public void dealershipCanAddToStock(){
        ccClark.addToStock(tesla);
        assertEquals(1, ccClark.countStock());
    }

    @Test
    public void dealershipCanRemoveFromstock(){
        ccClark.addToStock(tesla);
        ccClark.sellCar(tesla);
        assertEquals(0, ccClark.countStock());
    }

    @Test
    public void dealershipSellingCarAddsToFunds(){
        ccClark.addToStock(tesla);
        ccClark.sellCar(tesla);
        assertEquals(10000, ccClark.getTill());
    }

}
