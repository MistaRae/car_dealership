import Car.Car;
import org.junit.Before;

public class TestPetrolCar {

    private Car car;

    @Before
    public void setUp(){
     car = new Car(1000, "red");
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
    public void petrolCarHasHorsePower(){
        assertEquals(100, petrolEngine.getHorsePower());
    }

    @Test
    public void petrolCarEngineHasManufacturer(){
        assertEquals("Honda", petrolEngine.getManufacturer());
    }

}
