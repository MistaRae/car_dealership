import Car.Car;
import org.junit.Before;

public class TestPetrolCar {

    private Car car;

    @Before
    public void setUp(){
     car = new Car(1000, "red");
    }

}
