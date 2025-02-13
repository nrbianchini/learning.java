package bianchini.nathalia.learningjava.javacore.introductionmethods.test;

import bianchini.nathalia.learningjava.javacore.introductionmethods.domain.person;

public class personTest {
    public static void main(String[] args) {
    person Person = new person();

    Person.setName("Nathalia");
    Person.setAge(20);

    System.out.println(Person.getName());
    System.out.println(Person.getAge());
    }
}
