package org.example;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        var truck1 = new Truck(90);
        var truck2 = new Truck(89);

        var boat1 = new Boat(150);
        var boat2 = new Boat(160);

        var human1 = new Human();
        var human2 = new Human();

        var truck3 = new Truck(350) {
            @Override
            public void move() {
                System.out.println("Im super truck I can drive with 350km/h");
            }
        };

        List<Mobile> mobiles = List.of(truck1, truck2, truck3, boat1, boat2, human1, human2);

        var randomMobile = genericPrint(mobiles);
        randomMobile.move();

        print(() -> System.out.println("I cannot run at all"));

        introduce((parameter) -> System.out.println("Hello " + parameter));
    }

    public static void print(Mobile mobile) {
        mobile.move();
    }

    public static void introduce(Talkable talkable) {
        talkable.sayHello("Mateusz");
    }

    public static <T extends Mobile> T genericPrint(List<T> mobiles) {
        for (Mobile mobile : mobiles) {
            if (mobile instanceof Vehicle) {
                System.out.printf("to jest pojazd, maksymalna prędkość: %d\n", ((Vehicle) mobile).getMaxSpeed());
            } else {
                System.out.println("to nie jest pojazd");
            }
        }
        return mobiles.get(new Random().nextInt(mobiles.size()));
    }
}