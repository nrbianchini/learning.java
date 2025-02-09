package bianchini.nathalia.learningjava.introduction;

public class aula06EstruturasDeRepeticaoExericicio2 {
    public static void main(String[] args) {
        double totalPrice = 45000;

        for (int quota = 1; quota <= totalPrice; quota++) {
            double quotaPrice = totalPrice / quota;

            if (quotaPrice < 1000) {
                break;
            }
            System.out.println("parcela " +quota+ " R$"+quotaPrice);
        }
    }
}
