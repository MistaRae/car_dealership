
import Car.PetrolCar;
import Car.components.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPetrolCar  {

    private PetrolCar petrolcar;
    private PetrolEngine petrolEngine;

    @Before
    public void setUp(){
        petrolEngine = new PetrolEngine(100, "Honda");
        petrolcar = new PetrolCar(1000, "red", petrolEngine,200 );
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

//    @Test
//    public void petrolCarCanChangeColour(){
//        assertEquals("blue", petrolcar.respray('blue'));
//    }

    @Test
    public void petrolCarHasHorsePower(){
        assertEquals(100, petrolEngine.getHorsePower());
    }

    @Test
    public void petrolCarEngineHasManufacturer(){
        assertEquals("Honda", petrolEngine.getManufacturer());
    }

}
