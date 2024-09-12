import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int five = 0;
    static int three = 0;
    static boolean able = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        find(n);
        if (!able) {
            System.out.println("-1");
        } else {
            System.out.println(five+three);
        }

    }

    public static void find(int n) {
        // 5봉지를 하나라도 쓰는 경우
        for (int i = n / 5; i >= 1; i--) {
            int temp = n-(5*i);
            if (temp % 3 == 0) {
                five = i;
                three = temp/3;
                able = true;
                return;
            }
        }

        // 3봉지만 쓰는 경우
        if (n % 3 == 0) {
            three = n / 3;
            able = true;
        }

    }
}
