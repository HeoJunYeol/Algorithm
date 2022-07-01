import java.util.Scanner;

public class Main_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] recode = new int[n];
        int max = -1;
        for(int i = 0; i < n; i++){
            recode[i] = sc.nextInt();
            if(max < recode[i]){
                max = recode[i];
            }
        }
        double answer = 0;
        for(int i=0; i < n; i++){
            answer += (double)recode[i]/max*100;
        }
        System.out.println(answer/n);
    }
}
