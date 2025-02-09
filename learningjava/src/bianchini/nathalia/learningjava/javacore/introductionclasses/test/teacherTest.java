package bianchini.nathalia.learningjava.javacore.introductionclasses.test;

import bianchini.nathalia.learningjava.javacore.introductionclasses.domain.teacher;

public class teacherTest {
    public static void main(String[] args) {
    teacher Teacher = new teacher();
    Teacher.name = "Me. Raquel";
    Teacher.age = 40;
    Teacher.gender = 'F';

    System.out.println(Teacher.name + "\n" + Teacher.age + "\n" + Teacher.gender);
    }
}
