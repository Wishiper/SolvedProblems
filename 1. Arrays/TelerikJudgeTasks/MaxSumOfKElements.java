import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(N);

        while (list.size() < N) {
            int i = scanner.nextInt();
            list.add(i);

        }

        int sum =0;
        Collections.sort(list);
        for (int i = list.size() - K; i < list.size(); i++) {
            sum += list.get(i);

        }
        System.out.println(sum);
    }
}