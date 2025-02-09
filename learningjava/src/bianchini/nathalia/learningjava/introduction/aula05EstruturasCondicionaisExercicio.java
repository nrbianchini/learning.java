package bianchini.nathalia.learningjava.introduction;
import java.util.Scanner;

public class aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira seu salário: ");
        double salary = sc.nextDouble();
        sc.close();

        double tax = 0;

        if (salary <= 34712){
            tax = salary * 0.097;
        }
        else if (salary <= 68507){
            tax = salary * 0.3735;
        }
        else {
            tax = salary * 0.495;
        }
        System.out.println("impostos: " + tax);
    }
}
