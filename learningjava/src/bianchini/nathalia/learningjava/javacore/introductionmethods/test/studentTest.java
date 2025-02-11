package bianchini.nathalia.learningjava.javacore.introductionmethods.test;

import bianchini.nathalia.learningjava.javacore.introductionmethods.domain.printStudent;
import bianchini.nathalia.learningjava.javacore.introductionmethods.domain.student;

public class studentTest {
    public static void main(String[] args) {
        student Student = new student();
        student StudentV1 = new student();
//      printStudent printer = new printStudent();

        Student.name = "Nathalia";
        Student.age = 20;
        Student.gender = 'F';

        StudentV1.name = "Gustavo";
        StudentV1.age = 14;
        StudentV1.gender = 'M';

        printStudent.printer(Student);
        printStudent.printer(StudentV1);
    }
}
