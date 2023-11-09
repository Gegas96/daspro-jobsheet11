import java.util.Scanner;

public class NestedLoop_2341760140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] angka = new double[5][7];
        int[] rata = new int[5];
        int rata2;

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Kota ke-" +(i+1));
            for (int j = 0; j < angka[0].length; j++) {
                System.out.print("Hari ke-" +(j+1)+ ": ");
                angka[i][j] = sc.nextDouble();
                rata[i] += angka[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Kota ke-" +(i+1)+ ": ");
            rata2 = rata[i] / angka.length;
            System.out.println("Rata-rata suhu di kota-" +(i+1)+ ": " +rata2);
            for (int j = 0; j < angka[0].length; j++) {
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }

        // int nomor = 1;
        //  for (int[] i : angka) {
            //  System.out.print("kota ke-" +nomor++ + ": ");
            //  for (int hari : i) {
                //  System.out.print(hari + " ");
            //  }
            //  System.out.println();
        //  }





    }
}
