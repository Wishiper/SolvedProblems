import java.util.Scanner;

public class Trapezoid {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();


        for (int i = 0; i <N*2 ; i++) {
            if(i<=N-1){
                System.out.print(".");}
            else{
                System.out.print("*");
            }


        }
        System.out.println();
        for (int i = 0; i <N-1 ; i++) {
            int count = N-1-i;
            for (int j = 0; j < N*2; j++) {
                if(j== count || j ==(N*2)-1){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }

            }
            System.out.println();



        }
        for (int i = 0; i < 2*N; i++) {
            System.out.print("*");

        }

    }


}