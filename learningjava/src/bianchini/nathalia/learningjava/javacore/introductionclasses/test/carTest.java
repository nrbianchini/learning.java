package bianchini.nathalia.learningjava.javacore.introductionclasses.test;

import bianchini.nathalia.learningjava.javacore.introductionclasses.domain.car;

public class carTest {
    public static void main(String[] args) {
        car Car1 = new car();
        Car1.brand = "Volkswagen";
        Car1.model = "Passat";
        Car1.year = 2018;

        System.out.println(Car1.brand);
        System.out.println(Car1.model);
        System.out.println(Car1.year);
    }
}