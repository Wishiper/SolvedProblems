import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        int maxSoFar=0;
        int maxEndingHere=0;

        for (int i = 0; i < N ; i++) {
            maxEndingHere = maxEndingHere+arr[i];
            if(maxEndingHere<0){
                maxEndingHere=0;
            }
            if(maxEndingHere>maxSoFar){
                maxSoFar=maxEndingHere;
            }


        }
        System.out.println(maxSoFar);
    }


}