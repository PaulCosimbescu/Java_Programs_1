package PolymorphismChallenge;

public class Car {


    private int cylinders;
    private int wheels;
    private boolean engine;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }
}
