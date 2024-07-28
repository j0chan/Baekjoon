import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] xArr = new int[n];
        int[] yArr = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }

        int xMax = -10000, yMax = -10000;
        int xMin = 10000, yMin = 10000;


        for (int i = 0; i < n; i++) {
            if (xMax < xArr[i]) {
                xMax = xArr[i];
            }
            if (yMax < yArr[i]) {
                yMax = yArr[i];
            }

            if (xMin > xArr[i]) {
                xMin = xArr[i];
            }
            if (yMin > yArr[i]) {
                yMin = yArr[i];
            }
        }

        int x = xMax - xMin;
        int y = yMax - yMin;

        System.out.println(x*y);
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