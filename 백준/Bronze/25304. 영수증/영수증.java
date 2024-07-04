import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();
        int now = 0;

        for (int i = 0 ; i<n ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            now = now + a*b;
        }

        if(x==now){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}