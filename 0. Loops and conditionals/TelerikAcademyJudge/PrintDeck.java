import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nline = in.nextLine();
        ArrayList<String>list = new ArrayList<>();
        for (int i = 2; i <=10 ; i++) {
            list.add(i+" of spades, "+i+" of clubs, "+i+ " of hearts, "+i+ " of diamonds");

        }
        list.add("J of spades, J of clubs, J of hearts, J of diamonds");
        list.add("Q of spades, Q of clubs, Q of hearts, Q of diamonds");
        list.add("K of spades, K of clubs, K of hearts, K of diamonds");
        list.add("A of spades, A of clubs, A of hearts, A of diamonds");
        int n;

        if(nline.equals("J")){
            n=11;
        }else if(nline.equals("Q")){
            n=12;
        }else if(nline.equals("K")){
            n=13;
        }else if(nline.equals("A")){
            n=14;
        }else{
            n= Integer.parseInt(nline);
        }
        for (int i = 0; i < n-1 ; i++) {
            System.out.println(list.get(i));

        }
    }


}