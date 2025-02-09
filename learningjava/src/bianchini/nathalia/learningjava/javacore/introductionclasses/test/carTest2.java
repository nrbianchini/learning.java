package bianchini.nathalia.learningjava.javacore.introductionclasses.test;

import bianchini.nathalia.learningjava.javacore.introductionclasses.domain.car;

public class carTest2 {
    public static void main(String[] args) {
        car Car2 = new car();
        Car2.brand = "Chevrolet";
        Car2.model = "Equinox";
        Car2.year = 2024;

        System.out.println(Car2.brand);
        System.out.println(Car2.model);
        System.out.println(Car2.year);
    }
}
