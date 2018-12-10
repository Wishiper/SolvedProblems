import java.io.IOException;
import java.util.Scanner;

public class LargestThanNeightbours {
    public static void main(String[] args) throws IOException {
        Scanner in2 = new Scanner(System.in);
        int n = in2.nextInt();
        String useless = in2.nextLine();
        String[] nums = in2.nextLine().split(" ");
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        for (int i = 0; i < arr.length ; i++) {
            if(i!=0&& i!=n-1){
                if(arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
                    count++;
                }
            }

        }
        System.out.println(count);




    }

}
