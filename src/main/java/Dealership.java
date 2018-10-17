import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> stock;
    private ArrayList<Customer> customers;
    private int till;

    public Dealership(ArrayList<Car> stock, ArrayList<Customer> customers, int till) {
        this.stock = stock;
        this.customers = customers;
        this.till = till;
    }


    public int countStock() {
        return this.stock.size();
    }

    public int getTill() {
        return this.till;
    }

    public void sellCar(Car car) {
        this.stock.remove(car);
        this.till += car.getValue();
    }

    public void buyCar(Car car) {
        this.stock.add(car);
        this.till -= car.getValue();
    }

    public void repairCar(Car car, int amount) {
        car.repair(amount);
    }
}
