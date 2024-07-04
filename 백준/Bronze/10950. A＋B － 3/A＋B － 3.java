import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] sum = new int[num];


        for (int i=0 ; i<num ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum[i] = a+b;
        }

        for(int a : sum){
            System.out.println(a);
        }
    }
}