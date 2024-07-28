import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(Math.max(a, b), c);
        int other = a + b + c - max;

        while (true) {
            if (max >= other) {
                max--;
            } else {
                break;
            }
        }

        System.out.println(other+max);

    }

}

/*
    41 64 16
    57
    56

 */