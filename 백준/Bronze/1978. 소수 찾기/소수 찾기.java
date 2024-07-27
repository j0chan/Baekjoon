import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while (st.hasMoreTokens()) {

            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                continue;
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
    1. 숫자 개수 n 입력받기
    2. n크기의 배열 초기화
    3. 숫자 입력받고 배열에 순서대로 넣기
    4. 하나씩 꺼내 소수 찾기 (count++)
 */