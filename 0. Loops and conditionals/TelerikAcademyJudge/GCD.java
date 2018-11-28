import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] firstone = in.nextLine().split(" ");

        int[] longestArr;
        longestArr = fillArray(firstone);
        int first = longestArr[0];
        int second = longestArr[1];
        int A;
        int B;


        if(first>second){
            A = first;
            B = second;
        }else{
            B = first;
            A = second;
        }

        while(true){
            if(A==0){
                System.out.println(B);
                break;
            }else if(B==0){
                System.out.println(A);
                break;
            }

            int result = A%B;
            A=B;
            B=result;

        }



    }
    private static int[] fillArray(String[] strArr) {
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length ; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
}