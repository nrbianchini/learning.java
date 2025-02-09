package bianchini.nathalia.learningjava.introduction;

public class aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        /* primeiro array representa os meses
        segundo representa o último dia dos meses
        */

        int [][] daysMonths = new int[4][3];
        daysMonths[0][0] = 31;
        daysMonths[0][1] = 28;
        daysMonths[0][2] = 31;

        daysMonths[1][0] = 30;
        daysMonths[1][1] = 31;
        daysMonths[1][2] = 30;

        daysMonths[2][0] = 31;
        daysMonths[2][1] = 31;
        daysMonths[2][2] = 30;

        daysMonths[3][0] = 31;
        daysMonths[3][1] = 30;
        daysMonths[3][2] = 31;

//        for (int i = 0; i < daysMonths.length; i++) {
//            for (int j = 0; j < daysMonths[i].length; j++) {
//                System.out.print(daysMonths[i][j] + " ");
//            }
//        }

        for (int[] arrBase: daysMonths) {
            for (int i: arrBase) {
                System.out.print(i);
            }
        }
    }
}
