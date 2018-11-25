import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class JoroTheRabbit {


    private static void fakeInput() {

        String input =
                "1, -2, -3, 4, -5, 6, -7, -8";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }


    public static void main(String[] args) throws IOException {

        fakeInput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine()
                .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean[] flags = new boolean[numbers.length];

        int currentPosition = 0;
        int currentStepCount = 0;
        int currentHopNumber = 0;
        int bestHopNumber = 0;


        int circularArray = numbers.length % numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            currentHopNumber = 0;


        }


    }


}
