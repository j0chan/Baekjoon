import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int[] input = new int[6];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 8;

        for (int i = 0; i < 6; i++){
            input[i] = sc.nextInt();
        }

        for(int j=0;j<6;j++){
            System.out.print(arr[j]-input[j]+" ");
        }
    }
}