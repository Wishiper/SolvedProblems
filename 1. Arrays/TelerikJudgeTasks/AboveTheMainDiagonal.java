import java.util.Scanner;



public class AboveTheMainDiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int row = N;
        int col = N;
        long a=1;

        long cube[][] = new long [row][col];
        for(int i = 0; i < cube.length; i++){
            long b = a;
            for(int j = 0; j < cube[0].length; j++){
                cube[i][j] = b;
                b*=2;

            }
            a*=2;
        }

        long sum =0;
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < N; j++) {
                if(j>i) {
                    sum+=cube[i][j];
                }

            }

        }
        System.out.println(sum);
    }

}
