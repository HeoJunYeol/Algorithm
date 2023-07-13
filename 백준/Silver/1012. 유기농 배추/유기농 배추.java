import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int m, n, k;
    static int[][] cabbage;
    static boolean[][] visit;
    static int count;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0){
            count =0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            cabbage = new int[m][n];
            visit = new boolean[m][n];
            for (int i=0; i<k; i++){
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                cabbage[x][y] = 1;
            }
            for (int x =0; x<m; x++){
                for (int y=0; y<n; y++){
                    if (cabbage[x][y] == 1 && ! visit[x][y]){
                        dfs(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int x, int y) {
        visit[x][y] = true;
        for (int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < m && cy < n){
                if (!visit[cx][cy] && cabbage[cx][cy] == 1){
                    dfs(cx,cy);
                }
            }
        }
    }
}
