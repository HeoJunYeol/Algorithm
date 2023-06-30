import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            int avg = 0;
            for (int i=0; i<n; i++){
                nums[i] = sc.nextInt();
                avg += nums[i];
            }
            avg /= n;
            int cnt = 0;
            for (int i=0; i<nums.length; i++){
                if(avg < nums[i]){
                    cnt++;
                }
            }
            System.out.println(String.format("%.3f",(double) cnt / (double) n *100.0) + "%");
        }
    }
}
