
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int L;
    static int C;
    static String[] arr;
    static String[] mo = {"a", "e", "i", "o", "u"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new String[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr);

        search(0, 0, new StringBuilder());
    }

    public static void search(int depth, int start, StringBuilder sb) {
        if (depth == L) {
            String str = sb.toString();
            if (isPrintable(str)) {
                System.out.println(str);
            }
            return;
        }

        for (int i = start; i < C; i++) {
            sb.append(arr[i]);
            search(depth + 1, i + 1, sb);
            sb.deleteCharAt(sb.length() - 1); // 백트래킹
        }
    }

    public static boolean isPrintable(String str) {
        int moCount = 0;
        int jaCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Arrays.asList(mo).contains(String.valueOf(str.charAt(i)))) {
                moCount++;
            } else {
                jaCount++;
            }
        }

        return moCount >= 1 && jaCount >= 2;
    }
}
