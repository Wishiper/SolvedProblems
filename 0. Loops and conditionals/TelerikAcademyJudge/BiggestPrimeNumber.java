import java.util.Scanner;
public class BiggestPrimeNumber {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        while(prim(n) == false){
            n--;
        }
        System.out.println(n);

    }


    public static boolean prim(int m){
        int n=m;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }

        }
        return true;
    }
}