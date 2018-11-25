import java.util.*;


public class Main {

    private static int[] readBuildings(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] buildings = new int[n];

        for (int i = 0; i < n; i++) {
            buildings[i] = in.nextInt();

        }
        return buildings;
    }

    public static void main(String[] args) {
        int[] buildings = readBuildings();
        int[] maxSkoks = new int[buildings.length];
        Stack<Integer> peeksIndices = new Stack<>();

        for (int i = buildings.length-1; i >= 0 ; i--) {
            while (!peeksIndices.empty()&& buildings[peeksIndices.peek()] <= buildings[i]){
                int peekIndex = peeksIndices.pop();
                maxSkoks[peekIndex] = peeksIndices.size();
            }
            peeksIndices.push(i);

        }
        while (!peeksIndices.isEmpty()){
            int peekIndex = peeksIndices.pop();
            maxSkoks[peekIndex] = peeksIndices.size();
        }


        int max =  Arrays.stream(maxSkoks).max().getAsInt();
        System.out.println(max);
        for (int skok:maxSkoks) {
            System.out.print(skok+" ");

        }

    }


}