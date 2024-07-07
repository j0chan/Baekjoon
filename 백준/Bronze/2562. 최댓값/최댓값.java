import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];


        int count = 0;
        int max = 0;

        for (int j = 0; j < 9; j++) {
            arr[j] = Integer.parseInt(br.readLine());
            if (max < arr[j]) {
                max = arr[j];
                count = j + 1;
            }
        }

        System.out.println(max);
        System.out.println(count);

    }
}
