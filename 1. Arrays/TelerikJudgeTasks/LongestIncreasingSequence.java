import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 1;
        int currCount = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                currCount++;
            }else {
                if (currCount > count) {
                    count = currCount;
                }
                currCount = 1;
            }
        }

        System.out.println(Math.max(currCount,count));


    }
}