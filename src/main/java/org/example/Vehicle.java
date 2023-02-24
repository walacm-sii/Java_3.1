package org.example;

public abstract class Vehicle implements Mobile {
    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void move() {
        System.out.printf("My max speed is: %d\n", maxSpeed);
    }
}
