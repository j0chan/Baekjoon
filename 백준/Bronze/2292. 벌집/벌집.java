import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int range = 2;
        int count = 0;
        if (n ==1) {
            count = 1;
        } else {
            while (range <= n) {
                range = range + (6*count);
                count++;
            }
        }

        System.out.println(count);
    }
}