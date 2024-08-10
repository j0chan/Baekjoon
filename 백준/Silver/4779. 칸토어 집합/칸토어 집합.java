import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;


        while ((input=br.readLine())!=null) {
            int n = Integer.parseInt(input);
            int length = (int) Math.pow(3, n);

            StringBuilder sb = new StringBuilder("-".repeat(length));

            if (n == 0) {
                System.out.println("-");
            } else {
                cantor(sb, 0, length);
                System.out.println(sb);
            }
        }
    }

    public static void cantor(StringBuilder sb, int start, int length) {
        //길이가 1이면 return
        if (length == 1) {
            return;
        }

        int partLeng = length / 3;

        for (int i = partLeng + start; i < partLeng * 2 + start; i++) {
            sb.setCharAt(i, ' ');
        }

        cantor(sb, start, partLeng); // 앞쪽 1/3부분
        cantor(sb, start + partLeng * 2, partLeng); // 뒤쪽 1/3부분
    }
}
