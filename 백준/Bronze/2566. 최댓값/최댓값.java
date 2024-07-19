import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxN = 1;
        int maxM = 1;
        int max = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxN = i + 1;
                    maxM = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxN + " " + maxM);

    }
}