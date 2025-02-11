package bianchini.nathalia.learningjava.javacore.introductionmethods.test;

import bianchini.nathalia.learningjava.javacore.introductionmethods.domain.student;

public class studentTest2 {
    public static void main(String[] args) {
        student Student = new student();
        student StudentV1 = new student();

        Student.name = "Nathalia";
        Student.age = 20;
        Student.gender = 'F';

        StudentV1.name = "Gustavo";
        StudentV1.age = 14;
        StudentV1.gender = 'M';

        Student.print();
        StudentV1.print();
    }
}
