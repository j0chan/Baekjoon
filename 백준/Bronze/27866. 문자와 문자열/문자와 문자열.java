import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int n = sc.nextInt()-1;

        System.out.println(input.charAt(n));

        sc.close();
    }
}