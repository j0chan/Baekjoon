import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr;
        double sumOfCredit = 0;
        double sumOfCalc = 0;

        for (int i = 0; i < 20; i++) {
            String input = sc.nextLine();
            arr = input.split(" ");
            if (!arr[2].equals("P")) {
                double credit = Double.parseDouble(arr[1]);
                sumOfCredit += Double.parseDouble(arr[1]);
                sumOfCalc += calc(credit, arr[2]);
            }
        }

        System.out.printf("%.6f", sumOfCalc/sumOfCredit);
    }

    public static double calc(double credit, String grade) {
        double mark = 0.0;
        switch (grade) {
            case "A+":
                mark = 4.5;
                break;
            case "A0":
                mark = 4.0;
                break;
            case "B+":
                mark = 3.5;
                break;
            case "B0":
                mark = 3.0;
                break;
            case "C+":
                mark = 2.5;
                break;
            case "C0":
                mark = 2.0;
                break;
            case "D+":
                mark = 1.5;
                break;
            case "D0":
                mark = 1.0;
                break;
            case "F":
                mark = 0.0;
                break;
        }
        return mark * credit;
    }
}