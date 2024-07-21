import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] arr= new String[5][15];

        for (int i = 0; i < 5; i++) {
            String input = sc.next();
            if(input.length()!=15){
                for (int j = 0; j < input.length(); j++) {
                    arr[i][j] = String.valueOf(input.charAt(j));
                }
                for (int j = input.length(); j < 15; j++) {
                    arr[i][j] = "";
                }
            } else{
                for (int j = 0; j < 15; j++) {
                    arr[i][j] = String.valueOf(input.charAt(j));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb.toString());
    }
}


/*


 */