package bianchini.nathalia.learningjava.javacore.introductionmethods.test;

import bianchini.nathalia.learningjava.javacore.introductionmethods.domain.calculator;

public class calculatorTest3 {
    public static void main(String[] args) {
        calculator Calculator = new calculator();
        double result = Calculator.divideTwoNumbers(7, 2);
        System.out.println(result);

//        System.out.println(Calculator.divideTwoNumbers(7, 2));
    }
}
