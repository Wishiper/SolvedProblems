import java.util.Scanner;

public class MatrixOfNumbers {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        int n = score.nextInt();

        int count = n;

        for (int i = 1; i <= n; i++) {

            System.out.println();
            for (int j = i  ; j <= count ; j++) {
                System.out.print(j+" ");




            }
            count++;

        }


    }

}