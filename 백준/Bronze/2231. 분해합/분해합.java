import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int m = 0;

        for (int i = 0; i < n; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum = sum + num%10;
                num = num/10;
            }

            if (sum + i == n) {
                m = i;
                break;
            }
        }

        System.out.println(m);
    }

}