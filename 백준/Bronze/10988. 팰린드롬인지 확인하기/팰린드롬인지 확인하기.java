import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int ans = 1;
        int leng = input.length();

        for(int i=0 ; i<leng ; i++){
            if(input.charAt(i) != input.charAt(leng-i-1)){
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}