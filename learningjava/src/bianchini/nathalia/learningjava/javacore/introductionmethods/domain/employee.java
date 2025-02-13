package bianchini.nathalia.learningjava.javacore.introductionmethods.domain;

public class employee {
    private String name;
    private int age;
    private double[] salaries;
    private double sum;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);

        if (this.salaries != null) {
            for (double salary : salaries) {
                System.out.print(salary + " ");
            }
        }
        avgSalary();
    }

    public void avgSalary() {
        if (this.salaries == null) {
            return;
        }
        for (double salary : salaries) {
            sum += salary;
        }
        System.out.printf("\n%.2f%n", sum / salaries.length);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public double getSum() {
        return sum;
    }
}
