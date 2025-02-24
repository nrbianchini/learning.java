package bianchini.nathalia.learningjava.javacore.staticModifier.domain;

public class car {
    private String brand;
    private double maxVelocity;
    public static double limitVelocity = 250;

    public car(String name, double maxVelocity) {
        this.brand = name;
        this.maxVelocity = maxVelocity;
    }

    public void print() {
        System.out.println("***");
        System.out.println("Marca: " + this.brand);
        System.out.println("Velocidade máxima: " + this.maxVelocity);
        System.out.println("Limite de  velocidade: " + car.limitVelocity);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
}

