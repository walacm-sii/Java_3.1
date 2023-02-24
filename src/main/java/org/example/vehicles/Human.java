package org.example.vehicles;

public class Human implements Mobile, Talkable {
    @Override
    public void move() {
        System.out.println("Im human I can run with 13km/h");
    }

    @Override
    public void sayHello(String name) {
        System.out.printf("hello, nice to meet you %s", name);
    }
}
