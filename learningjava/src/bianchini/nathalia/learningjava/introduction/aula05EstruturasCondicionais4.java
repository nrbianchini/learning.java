package bianchini.nathalia.learningjava.introduction;

public class aula05EstruturasCondicionais4 {
    public static void main(String[] args) {
    /* utilizando switch dados os valores de um à sete, imprima se é dia útil ou final de semana
    considere um como domingo
     */
        byte weekDay = 2;

        switch (weekDay) {
            case 1, 7:
                System.out.println("final de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("dia útil");
                break;
        }
    }
}

