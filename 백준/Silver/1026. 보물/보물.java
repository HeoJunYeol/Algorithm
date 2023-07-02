import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int s = 0;
        int[] a = new int[N];
        Integer[] b = new Integer[N];
        for (int i=0; i<2; i++){
            String[] str = sc.nextLine().split(" ");
            for (int j =0; j<N; j++){
                if (i == 0){
                    a[j] = Integer.parseInt(str[j]);
                }
                else {
                    b[j] = Integer.parseInt(str[j]);
                }
            }
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for (int i=0; i<N; i++){
            s += a[i] * b[i];
        }
        System.out.println(s);
    }
}
