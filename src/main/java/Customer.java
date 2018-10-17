public class Customer {

    private String name;
    private int wallet;
    private Car car;

    public Customer(String name, int wallet, Car car) {
        this.name = name;
        this.wallet = wallet;
        this.car = car;
    }

    public Car getCar() {
        return this.car;
    }

    public void buyCar(Car car) {
        this.car = car;
        this.wallet -= car.getValue();
    }

    public int getWallet() {
        return this.wallet;
    }
}
