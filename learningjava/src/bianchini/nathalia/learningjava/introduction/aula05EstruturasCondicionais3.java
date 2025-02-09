package bianchini.nathalia.learningjava.introduction;

import java.util.Scanner;

public class aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo

        Scanner sc = new Scanner(System.in);

        System.out.println("insira o dia da semana: ");
        byte weekDay = sc.nextByte();
        sc.close();

        switch (weekDay) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda-feira");
                break;
            case 3:
                System.out.println("terca-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("data inválida");
                break;
        }
    }
}
