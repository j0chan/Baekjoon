import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();

		int result6 = input2*input1;
		
		while(input2 > 0) {
			arr.add(input2%10);
			input2 = input2 / 10;
		}
		
		int result3 = arr.get(0)*input1;
		int result4 = arr.get(1)*input1;
		int result5 = arr.get(2)*input1;
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}
}
