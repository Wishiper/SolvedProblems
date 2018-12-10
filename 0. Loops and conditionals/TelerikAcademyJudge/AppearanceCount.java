import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppearanceCount {
    public static void main(String[] args) {
        int result = xAppearsinArray();
        System.out.println(result);


    }
    private static int xAppearsinArray(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(br);
        int N = input.nextInt();
        int count = 0;
        int[] numbers = new int[N];
        for (int i = 0; i< N; i++)
        {
            numbers[i] = input.nextInt();
        }
        int x = input.nextInt();
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i]==x){
                count++;
            }


        }
        return count;
    }
}