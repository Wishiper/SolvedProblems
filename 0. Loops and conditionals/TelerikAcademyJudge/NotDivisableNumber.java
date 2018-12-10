import java.util.Scanner;

public class NotDivisableNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i <=N; i++) {
            boolean print  = isDivisible(i);
            if(print){
                System.out.print(i+" ");
            }

        }

    }
    public static boolean isDivisible (int N) {
        boolean divisible = false;
        if (N % 3 != 0 && N % 7 != 0) {
            divisible = true;
        }
        else divisible = false;
        return divisible;
    }
}