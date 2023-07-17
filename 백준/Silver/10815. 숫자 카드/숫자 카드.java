import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<m; i++){
            int num = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = n-1;
            boolean search = false;

            while (left <= right){
                int midIndex = (left + right) / 2;
                int mid = arr[midIndex];
                
                if (num < mid) {
                    right = midIndex -1;
                }
                else if (num > mid) {
                    left = midIndex +1;
                }
                else {
                    search = true;
                    break;
                }
                search = false;
            }
            if (search) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
