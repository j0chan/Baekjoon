import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        ArrayList<Integer> newArr = new ArrayList<>();

        for (int x = 0; x < n; x++) {
            arr[x] = x + 1;
        }

        for (int x = 0; x < m; x++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            while (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }


    }
}
