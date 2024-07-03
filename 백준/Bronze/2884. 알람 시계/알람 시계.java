import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            m = m - 45;
        } else {
            m = m + 15;
            if (h > 0) {
                h = h - 1;
            } else {
                h = 23;
            }
        }

        System.out.println(h + " " + m);

    }
}