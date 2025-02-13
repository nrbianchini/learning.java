package bianchini.nathalia.learningjava.javacore.introductionmethods.domain;

public class person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Invalid age");
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}


