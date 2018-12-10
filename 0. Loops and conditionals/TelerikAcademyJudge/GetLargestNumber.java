import java.util.Scanner;

public class GetLargestNumber {
    public static void main(String[] args) {
        Scanner in2 = new Scanner(System.in);

        String[] nums = in2.nextLine().split(" ");
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        int firstCheck = GetMax(arr[0],arr[1]);
        int result = GetMax(firstCheck,arr[2]);
        System.out.println(result);


    }
    private static int GetMax(int A, int B){
        return Math.max(A,B);

    }
}