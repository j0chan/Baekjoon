import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[30];
        ArrayList<Integer> absent = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            arr[i] = false;
        }

        for (int i = 0; i < 28; i++) {
            int input = sc.nextInt() - 1;
            arr[input] = true;
        }

        for (int i = 0; i < 30; i++) {
            if(!arr[i]){
                absent.add(i+1);
            }
        }

        for(int num : absent){
            System.out.println(num);
        }


    }
}
