import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a + b;
            arr[i - 1] = "Case #" + i + ": " + a + " + " + b + " = " + c;
        }

        for (String a : arr) {
            System.out.println(a);
        }
        
        br.close();
    }
}