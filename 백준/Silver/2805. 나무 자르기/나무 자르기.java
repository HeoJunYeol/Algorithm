import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] trees = new int[n+1];
        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i =1; i<=n; i++){
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }
        long start = 0;
        long end = max;
        while (start <= end){
            long mid = (start + end) / 2;
            long sum =0;
            for (int tree : trees){
                if (tree > mid){
                    sum += tree - mid;
                }
            }
            if (sum >= m){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println(end);
    }
}
