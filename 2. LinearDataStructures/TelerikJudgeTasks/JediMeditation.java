import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jedicoutn = in.nextInt();
        String useless = in.nextLine();
        String[] jedi = in.nextLine().split(" ");
        ArrayList<String> Masters = new ArrayList<>();
        ArrayList<String> Knights = new ArrayList<>();
        ArrayList<String> Padawans = new ArrayList<>();
        ArrayList<String > finalJedi = new ArrayList<>();


        for (int i = 0; i < jedi.length; i++) {
            char currjedi = jedi[i].charAt(0);
            if (currjedi == 'M') {
                Masters.add(jedi[i]);
            }
            if (currjedi == 'K') {
                Knights.add(jedi[i]);
            }
            if(currjedi =='P'){
                Padawans.add(jedi[i]);
            }

        }
        finalJedi.addAll(Masters);
        finalJedi.addAll(Knights);
        finalJedi.addAll(Padawans);
        for (String s:finalJedi) {
            System.out.print(s+" ");

        }


    }
}