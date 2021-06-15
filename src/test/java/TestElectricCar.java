import Car.ElectricCar;
import Car.components.ElectricMotor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestElectricCar {

    private ElectricCar electricCar;
    private ElectricMotor electricMotor;

    @Before
    public void setUp(){
        electricMotor = new ElectricMotor(150,"Tesla");
        electricCar = new ElectricCar(10000, "blue", electricMotor,250);
    }

    @Test
    public void electricMotorHasHorsepower(){
        assertEquals(150, electricMotor.getHorsePower());
    }

    @Test
    public void electricMotorHasManufacturer(){
        assertEquals("Tesla", electricMotor.getManufacturer());
    }

    @Test
    public void electricCarCanStart() {
        assertEquals("i'm an electric motor - hear me roar", electricCar.start());
    }

    @Test
    public void electricCarHasBattery (){
        assertEquals(250,electricCar.getBattery());
    }

    @Test
    public void electricCarDrivingReducesBattery(){
        electricCar.drive(50);
        assertEquals(200, electricCar.getBattery());
    }

//    @Test
//    public void
//
}
