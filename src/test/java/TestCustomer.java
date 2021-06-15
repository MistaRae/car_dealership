import Car.Car;
import Car.ElectricCar;
import Car.components.ElectricMotor;
import Car.components.Gearbox;
import Car.components.Tyre;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCustomer {

    private Customer mark;
    private ArrayList<Car> ownedCars;
    private ElectricCar tesla;
    private ElectricMotor electricMotor;
    private Tyre frontLeft;
    private Tyre frontRight;
    private Tyre rearLeft;
    private Tyre rearRight;


    @Before
    public void setUp(){
        frontLeft = new Tyre(100);
        frontRight = new Tyre(100);
        rearLeft = new Tyre(100);
        rearRight = new Tyre(100);
        electricMotor = new ElectricMotor(150,"Tesla");
        tesla = new ElectricCar(10000, "blue", electricMotor, Gearbox.AUTOMATIC, frontLeft, frontRight, rearLeft, rearRight,250);

        ownedCars = new ArrayList<>();
        mark = new Customer(ownedCars, 11000);
    }

    @Test
    public void customerStartsWithNoCars(){
        assertEquals(0, mark.countOwnedCars());
    }

    @Test
    public void customerStartsWithAWallet(){
        assertEquals(11000, mark.getWallet());
    }

    @Test
    public void customerCanAddToCollection(){
        mark.buyCar(tesla);
        assertEquals(1, mark.countOwnedCars());
    }


}
