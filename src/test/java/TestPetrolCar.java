
import Car.PetrolCar;
import Car.components.PetrolEngine;
import Car.components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPetrolCar  {

    private PetrolCar petrolcar;
    private PetrolEngine petrolEngine;
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
        petrolEngine = new PetrolEngine(100, "Honda");
        petrolcar = new PetrolCar(1000, "red", petrolEngine,frontLeft, frontRight, rearLeft, rearRight,200);
    }

    @Test
    public void petrolCarHasFuelTank(){
        assertEquals(200, petrolcar.getFuelTank());
    }

    @Test
    public void petrolCarHasPrice(){
        assertEquals(1000, petrolcar.getPrice());
    }

    @Test
    public void petrolCarHasColour(){
        assertEquals("red", petrolcar.getColour());
    }

    @Test
    public void petrolCarCanChangeColour(){
        petrolcar.reSpray("blue");
        assertEquals("blue",petrolcar.getColour());
    }

    @Test
    public void petrolCarHasHorsePower(){
        assertEquals(100, petrolEngine.getHorsePower());
    }

    @Test
    public void petrolCarEngineHasManufacturer(){
        assertEquals("Honda", petrolEngine.getManufacturer());
    }

    @Test
    public void drivingUsesPetrol(){
        petrolcar.drive(100);
        assertEquals(100, petrolcar.getFuelTank());
    }

}
