import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Wheel wheel;
    private ArrayList<Wheel> wheels;
    private Body body;
    private Engine engine;
    private Car car;

    @Before
    public void before() {
        wheel = new Wheel();
        wheels = new ArrayList<Wheel>();
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);
        body = new Body();
        engine = new Engine("Petrol");
        car = new Car(engine, wheels, body, "Ford", "Focus", "Purple", 8000);
    }

    @Test
    public void sustainDamage() {
        car.sustainDamage(1000);
        assertEquals(7000, car.getValue());
    }

    @Test
    public void repair() {
        car.sustainDamage(1000);
        car.repair(500);
        assertEquals(7500, car.getValue());
    }

}
