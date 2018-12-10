import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] Binary = in.nextLine().split("");
        int[] longestArr;
        longestArr = fillArray(Binary);
        int index =longestArr.length-1;
        int result = 0;
        for (int i1 : longestArr) {
            result += i1 * Math.pow(2, index);
            index--;


        }
        System.out.println(result);


    }
    private static int[] fillArray(String[] strArr) {
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length ; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

}
