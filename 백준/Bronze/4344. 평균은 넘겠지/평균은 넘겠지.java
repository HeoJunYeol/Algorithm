import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            int evg = 0;
            for (int i=0; i<n; i++){
                nums[i] = sc.nextInt();
                evg += nums[i];
            }
            evg /= n;
            int cnt = 0;
            for (int i=0; i<nums.length; i++){
                if(evg < nums[i]){
                    cnt++;
                }
            }
            System.out.println(String.format("%.3f",(double) cnt / (double) n *100.0) + "%");
        }
    }
}
