import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int five = 0;
    static int three = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        find(n);
    }

    public static void find(int n) {
        // 5봉지를 하나라도 쓰는 경우
        for (int i = n / 5; i >= 1; i--) {
            int temp = n-(5*i);
            if (temp % 3 == 0) {
                five = i;
                three = temp/3;
                System.out.println(five+three);
                return;
            }
        }
        
        // 3봉지만 쓰는 경우
        if (n % 3 == 0) {
            three = n / 3;
            System.out.println(five + three);
        } else {
            System.out.println("-1");
        }
    }
}