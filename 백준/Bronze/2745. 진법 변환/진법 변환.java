import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();

        int result = 0;
        int index = 0;
        int num = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            if (c >= '0' && c <= '9') {
                num= c-'0';
            } else{
                num = c-55;
            }
            result += (int) (num * Math.pow(b,index));
            index++;
        }
        System.out.println(result);
    }
}


/*


 */