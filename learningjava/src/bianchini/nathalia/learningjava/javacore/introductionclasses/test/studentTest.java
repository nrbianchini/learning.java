package bianchini.nathalia.learningjava.javacore.introductionclasses.test;

import bianchini.nathalia.learningjava.javacore.introductionclasses.domain.student;

public class studentTest {
    public static void main(String[] args) {
        // sempre ao criar objetos utiliza-se a palavra "new"
        student Student = new student();
        Student.name = "Nathalia";
        Student.age = 20;
        Student.gender = 'F';

        System.out.println(Student.name);
        System.out.println(Student.age);
        System.out.println(Student.gender);
    }
}
