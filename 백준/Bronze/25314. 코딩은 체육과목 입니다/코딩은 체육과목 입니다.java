import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 4 != 0) {
            System.out.println("4의 배수를 입력해주세요");
            System.exit(0);
        }

        int div = n / 4;

        for (int i = 0; i<div ; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}