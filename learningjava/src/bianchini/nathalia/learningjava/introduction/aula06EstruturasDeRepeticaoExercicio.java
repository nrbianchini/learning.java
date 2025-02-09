package bianchini.nathalia.learningjava.introduction;

public class aula06EstruturasDeRepeticaoExercicio {
    public static void main(String[] args) {
        // imprima todos os números pares até 100.000

        for (int i = 0; i <= 100000; i+=2){
            System.out.println(i);
        }

        // imprima os primeiros 25 números de um dado valor
        byte number = 50;
        for (int i = 0; i <= number/2; i++){
            System.out.println(i);
        }
    }
}
