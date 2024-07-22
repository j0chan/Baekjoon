import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int q = 25;
        int qC = 0;
        int d = 10;
        int dC = 0;
        int n = 5;
        int nC = 0;
        int p = 1;
        int pC = 0;

        for (int i = 0; i < input; i++) {
            int charge = sc.nextInt();
            qC = charge / q;
            charge = charge % q;

            dC = charge / d;
            charge = charge % d;

            nC = charge / n;
            charge = charge % n;

            pC = charge / p;

            System.out.println(qC + " " + dC + " " + nC + " " + pC);
        }
    }
}