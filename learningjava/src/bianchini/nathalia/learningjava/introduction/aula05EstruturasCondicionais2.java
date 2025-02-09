package bianchini.nathalia.learningjava.introduction;

public class aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        double salary = 5000;
        String donateMessage = "irei doar R$500";
        String notDonateMessage = "não doarei R$500";

        /* (condição) ? verdadeiro : falso
        parecido com função SE no excel
         */
        String result = salary >= 5000 ? donateMessage : notDonateMessage;
        System.out.println(result);

        String otherResult = salary >= 5000 ? "irei doar R$500" : "não doarei R$500";
        System.out.println(otherResult);
    }
}
