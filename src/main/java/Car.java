import java.util.ArrayList;

public class Car {

    private Engine engine;
    private ArrayList<Wheel> wheels;
    private Body body;
    private String make;
    private String model;
    private String colour;
    private int value;

    public Car(Engine engine, ArrayList<Wheel> wheels, Body body, String make, String model, String colour, int value) {
        this.engine = engine;
        this.wheels = wheels;
        this.body = body;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void sustainDamage(int amount) {
        this.value -= amount;
    }

    public void repair(int amount) {
        this.value += amount;
    }




}
