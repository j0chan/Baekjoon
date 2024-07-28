import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        long n = Long.parseLong(br.readLine());

        System.out.println(4*n);
    }
}

/*
    윗면 = 1
    아랫면 = n+(n-1)
    옆면 = n*2

    n  1  2  3  4  5
    m  2

    4n

 */