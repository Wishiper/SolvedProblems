import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] Str = in.nextLine().split(",");

        int[] input = new int[Str.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(Str[i]);
        }
        Arrays.sort(input);
        int[] register = new int[input.length + 1];
        for (int i : input) {
            register[i] = 1;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < register.length; i++) {

            if (register[i] == 0) {
                arr.add(i);
            }


        }
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.size()==1|| i==arr.size()-1){
                System.out.print(arr.get(i));
            }
            else{
                System.out.print( arr.get(i)+",");}

        }
    }
}