import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Wheel wheel;
    private ArrayList<Wheel> wheels;
    private Body body;
    private Engine engine;
//    private Car oldCar;
    private Car car;
    private Customer customer;
    private ArrayList<Car> stock;
    private ArrayList<Customer> customers;
    private Dealership dealership;

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
//        oldCar = new Car(engine, wheels, body, "Austin", "Alegro", "Beige", 0);
        car = new Car(engine, wheels, body, "Ford", "Focus", "Purple", 8000);
        customer = new Customer("Customer1", 10000, car);
        stock = new ArrayList<Car>();
        stock.add(car);
        customers = new ArrayList<Customer>();
        customers.add(customer);
        dealership = new Dealership(stock, customers, 50000);
    }

    @Test
    public void countStock() {
        assertEquals(1, dealership.countStock());
    }

    @Test
    public void getTill() {
        assertEquals(50000, dealership.getTill());
    }

    @Test
    public void sellCarStockReduced() {
        dealership.sellCar(car);
        assertEquals(0, dealership.countStock());
    }

    @Test
    public void sellCarTillIncreased() {
        dealership.sellCar(car);
        assertEquals(58000, dealership.getTill());
    }

    @Test
    public void buyCarStockIncreased() {
        dealership.buyCar(car);
        assertEquals(2, dealership.countStock());
    }

    @Test
    public void buyCarTillReduced() {
        dealership.buyCar(car);
        assertEquals(42000, dealership.getTill());
    }

    @Test
    public void repairCar() {
        car.sustainDamage(1000);
        dealership.repairCar(car, 500);
        assertEquals(7500, car.getValue());
    }


}
