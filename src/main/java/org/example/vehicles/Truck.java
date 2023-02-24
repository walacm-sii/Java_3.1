package org.example.vehicles;

public class Truck extends Vehicle {
    public Truck(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.printf("Im truck, my max speed is: %d\n", getMaxSpeed());
    }
}
