package bianchini.nathalia.learningjava.introduction;

/*
    PRÁTICA
    Crie variáveis para os campos descritos abaixo entre <>
    e imprima a seguinte mensagem:
    "Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário de R$ <salário>, na data <data>.
 */
public class aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Nathalia";
        String address = "Rua Julio Mori";
        double salary = 1516.82;
        String dateSalary = "08/02/2025";

        String report = ("Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de R$"+salary+", na data "+dateSalary+".");
        System.out.println(report);
    }
}
