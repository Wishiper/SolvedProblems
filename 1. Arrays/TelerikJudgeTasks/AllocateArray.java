import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n = N;
        int[] array = new int[N];

        if(N>=0 && N<=20) {
            for(int i =0; i<n ; i++){
                array[i] = i*5;
                System.out.println(array[i]);
            }


        }
    }
}