import Car.ElectricCar;
import Car.components.ElectricMotor;
import Car.components.Gearbox;
import Car.components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestElectricCar {

    private ElectricCar electricCar;
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
        electricCar = new ElectricCar(10000, "blue", electricMotor,Gearbox.AUTOMATIC, frontLeft, frontRight, rearLeft, rearRight,250);
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
        assertEquals(210, electricCar.getBattery());
    }

    @Test
    public void drivingWearsOutTyres(){
        electricCar.drive(99);
        assertEquals(1, electricCar.getTyreLife(frontLeft));
    }

    @Test
    public void drivingWearsOutFrontLeft(){
        electricCar.drive(99);
        assertEquals(1, electricCar.getTyreLife(frontLeft));
    }

    @Test
    public void drivingWearsOutFrontRight(){
        electricCar.drive(99);
        assertEquals(1, electricCar.getTyreLife(frontRight));
    }

    @Test
    public void drivingWearsOutRearLeft(){
        electricCar.drive(99);
        assertEquals(1, electricCar.getTyreLife(rearLeft));
    }

    @Test
    public void drivingWearsOutRearRight(){
        electricCar.drive(99);
        assertEquals(1, electricCar.getTyreLife(rearRight));
    }

    @Test
    public void turningLeftwearsFrontLeftTyre(){
        electricCar.turn("left");
        assertEquals(99, electricCar.getTyreLife(frontLeft));
    }

    @Test
    public void turningRightwearsFrontRightTyre(){
        electricCar.turn("right");
        assertEquals(99, electricCar.getTyreLife(frontRight));
    }

}
