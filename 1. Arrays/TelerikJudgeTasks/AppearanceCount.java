import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppearanceCount {
    public static void main(String[] args) {
        int result = xAppearsinArray();
        System.out.println(result);


    }
    public static int xAppearsinArray(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(br);
        int N = input.nextInt();
        int count = 0;
        int numbersCount = N;
        int[] numbers = new int[numbersCount];
        for (int i=0;i<numbersCount;i++)
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