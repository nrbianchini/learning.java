package bianchini.nathalia.learningjava.javacore.introductionclasses.test;

import bianchini.nathalia.learningjava.javacore.introductionclasses.domain.car;

public class carTest {
    public static void main(String[] args) {
        car Car1 = new car();
        car Car2 = new car();

        Car1.brand = "Volkswagen";
        Car1.model = "Passat";
        Car1.year = 2018;

        Car2.brand = "Chevrolet";
        Car2.model = "Equinox";
        Car2.year = 2024;

        Car1 = Car2;
        // faz-se referência apenas com objetos de mesmo tipo

        System.out.println(Car1.brand);
        System.out.println(Car1.model);
        System.out.println(Car1.year);

        System.out.println(Car2.brand);
        System.out.println(Car2.model);
        System.out.println(Car2.year);
    }
}