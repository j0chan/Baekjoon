
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[][] arr;
    static boolean[] visited;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        // 간선 연결
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            arr[u][v] = 1;
            arr[v][u] = 1;
        }

        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            // 아직 탐색을 하지 않았다면
            if (!visited[i]) {
                dfs(i); // 탐색하면서 visited 채우면서
                count++; // count++
            }
        }

        System.out.println(count);

    }

    public static void dfs(int start) {
        visited[start] = true;

        for (int i = 1; i < n + 1; i++) {
            if (arr[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }

    }
}
