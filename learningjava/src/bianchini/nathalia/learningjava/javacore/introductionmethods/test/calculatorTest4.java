package bianchini.nathalia.learningjava.javacore.introductionmethods.test;

import bianchini.nathalia.learningjava.javacore.introductionmethods.domain.calculator;

public class calculatorTest4 {
    public static void main(String[] args) {
        calculator Calculator = new calculator();

        int [] nums = {1, 2, 3, 4, 5};
        Calculator.sumArray(nums);
        Calculator.sumVarArgs(6, 7, 8, 9, 10);
    }
}
