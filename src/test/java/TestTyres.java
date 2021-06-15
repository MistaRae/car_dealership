import Car.components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTyres {

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
    }

    @Test
    public void tyresHaveAServiceLife(){
        assertEquals(100, frontLeft.getLife());
    }

    @Test
    public void tyresCanBeEroded(){
        frontLeft.reduceLife(1);
        assertEquals(99, frontLeft.getLife());
    }
}
