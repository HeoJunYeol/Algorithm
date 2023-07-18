import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] n;
    static int[] m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = new int[N];
        for (int i=0; i<N; i++){
            n[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(n);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        m = new int[M];
        for (int i=0; i<M; i++){
            m[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<M; i++){
            System.out.println(isNumber(m[i]));
        }
    }

    private static int isNumber(int number) {
        int left =0;
        int right = n.length-1;
        while (left <= right){
            int midIndex = (left + right) / 2;
            int mid = n[midIndex];
            if (mid < number){
                left = midIndex + 1;
            } else if (mid > number) {
                right = midIndex - 1;
            }
            else return 1;
        }
        return 0;
    }
}
