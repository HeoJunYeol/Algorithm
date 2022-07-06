import java.util.Scanner;

public class Main_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1_000_000;
        int max = -1_000_000;
        for(int i =0; i <n; i++){
            int data = sc.nextInt();
            min = Math.min(min, data);
            max = Math.max(max, data);
        }
        System.out.printf("%d %d",min,max);
    }
}
