package bianchini.nathalia.learningjava.javacore.staticModifier.test;

import bianchini.nathalia.learningjava.javacore.staticModifier.domain.car;

public class carTest {
    public static void main(String[] args) {
    car Car1 = new car("Volkswagen",180);
    car Car2 = new car("Mercedes-Benz", 275);
    car Car3 = new car("Audi", 290);

    car.limitVelocity = 180;

    Car1.print();
    Car2.print();
    Car3.print();
    }
}