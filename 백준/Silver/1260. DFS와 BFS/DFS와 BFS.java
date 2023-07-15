import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int m, n, v;
    static boolean[] visit;
    static int[][] arr;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        visit = new boolean[n+1];
        while (m --> 0){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }
        dfs(v);
        System.out.println();
        visit = new boolean[n+1];
        bfs(v);
    }
    static void dfs(int v) {
        visit[v] = true;
        System.out.print(v + " ");
        for (int i=0; i<=n; i++){
            if (arr[v][i] == 1 && !visit[i]){
                dfs(i);
            }
        }
    }
    static void bfs(int v){
        queue.add(v);
        visit[v] = true;
        while (!queue.isEmpty()){
            v = queue.poll();
            System.out.print(v + " ");
            for(int i = 1 ; i <= n ; i++) {
                if(arr[v][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}
