import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Character> arr = new ArrayList<>();

        int N = sc.nextInt();
        int B = sc.nextInt();



        while (N>0) {
            int na = N % B;
            if(na<10){
                arr.add((char) (na+'0'));
            } else{
                arr.add((char) (na -10 +'A'));
            }
            N=N/B;
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
        }
    }
}