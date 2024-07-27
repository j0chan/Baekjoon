import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (int i = m; i < n + 1; i++) {
            if (isPrime(i)) {
                arr.add(i);
                sum += i;
            }
        }

        if (arr.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(arr.get(0));
        }
    }

    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}