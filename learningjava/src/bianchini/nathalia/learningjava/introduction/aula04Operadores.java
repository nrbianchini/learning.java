package bianchini.nathalia.learningjava.introduction;

public class aula04Operadores {
    public static void main(String[] args) {
        int number1 = 29;
        int number2 = 4;
        int result = number1 + number2;
        System.out.println(result);

        int remainder = 20 % 2;
        System.out.println(remainder);

        boolean isTwentyNineBiggerThanEleven = 20 > 11;
        System.out.printf("vinte é maior que onze? "+isTwentyNineBiggerThanEleven);

        int minute = 32;
        int month = 11;
        boolean isMinuteBiggerThanForty = 50 > 40 && 11 < 40;
        System.out.println("cinquenta é maior que quarenta e onze menor que quarenta? "+isMinuteBiggerThanForty);

        double bonus = 1000;
        bonus += 1800;
        bonus -= 500;
        System.out.println(bonus);
    }
}

