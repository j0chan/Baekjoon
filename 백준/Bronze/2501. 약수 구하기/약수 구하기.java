import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }

        if (arr.size()<k) {
            System.out.println("0");
        } else {
            System.out.println(arr.get(k-1));
        }


    }
}

/*
    1. N까지 반복해서 0이되는 i값 어레이리스트에 넣기
    2. k값 출력 없으면 0 출력
 */