import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromOneToN {
    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        generateAllNumberstoN(n);


    }

    private static int generateAllNumberstoN(int n) {
        if (n == 0) {
            return n;

        }
        generateAllNumberstoN(n - 1);
        System.out.print(n + " ");


        return n;

    }

}