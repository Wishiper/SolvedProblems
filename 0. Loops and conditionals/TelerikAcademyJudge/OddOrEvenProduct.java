import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in2 = new Scanner(System.in);
        int n = in2.nextInt();
        String useless = in2.nextLine();
        String[] nums = in2.nextLine().split(" ");
        long arr[] = new long[n];
        long oddsum=1;
        long evensum=1;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        for (int i = 0; i <arr.length ; i++) {
            oddsum*=arr[i];
            i++;

        }
        for (int i = 1; i <arr.length ; i++) {
            evensum*=arr[i];
            i++;

        }
        if(evensum==oddsum){
            System.out.println("yes"+ evensum);
        }else{
            System.out.println("no "+oddsum+" "+evensum);
        }



    }

}