import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        double sum=0;

        for (int j = 0; j < n; j++) {
            sum = sum + (double) arr[j]/max*100;
        }

        double avg = sum /n;

        System.out.println(avg);


    }
}
