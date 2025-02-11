package bianchini.nathalia.learningjava.javacore.introductionmethods.domain;

public class calculator {
    public void sumTwoNumbers() {
        System.out.println(2000+4);
    }

    public void subtractTwoNumbers() {
        System.out.println(31-2);
    }

    public void multiplyTwoNumbers(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public double divideTwoNumbers(double number1, double number2) {
        return number1 / number2;
    }

    public void sumArray(int [] nums){
        int sum = 0;
        for(int aux : nums){
            sum += aux;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... nums){
        int sum = 0;
        for(int aux : nums){
            sum += aux;
        }
        System.out.println(sum);
    }
}
