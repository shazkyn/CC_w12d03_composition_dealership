import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Wheel wheel;
    private ArrayList<Wheel> wheels;
    private Body body;
    private Engine engine;
    private Car oldCar;
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
        oldCar = new Car(engine, wheels, body, "Austin", "Alegro", "Beige", 0);
        car = new Car(engine, wheels, body, "Ford", "Focus", "Purple", 8000);
        customer = new Customer("Customer1", 10000, car);
        stock = new ArrayList<Car>();
        stock.add(car);
        customers = new ArrayList<Customer>();
        customers.add(customer);
        dealership = new Dealership(stock, customers, 50000);
    }

    @Test
    public void buyCarCustomerHasCar() {
        customer.buyCar(car);
        assertEquals(car, customer.getCar());
    }

    @Test
    public void buyCarCustomerWalletReduced() {
        customer.buyCar(car);
        assertEquals(2000, customer.getWallet());
    }
}
