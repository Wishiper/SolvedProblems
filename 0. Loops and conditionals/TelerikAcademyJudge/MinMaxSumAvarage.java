import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSumAvarage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double arr[]= new double[N];

        fillarray(in,arr);
        printMinMaxSumAvg(arr,in);
    }

    private static double[] fillarray(Scanner in, double arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }
        Arrays.sort(arr);
        return arr;

    }
    private static double getSum(double arr[]){
        double sum = 0.00;
        for(int i=0; i <arr.length ; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    private static void printMinMaxSumAvg(double arr[], Scanner in){
        DecimalFormat df = new DecimalFormat("####0.00");
        System.out.println("min="+df.format(arr[0]));
        System.out.println("max="+df.format(arr[arr.length-1]));
        System.out.println("sum="+df.format(getSum(arr)));
        System.out.println("avg="+df.format(getSum(arr)/arr.length));

    }
}