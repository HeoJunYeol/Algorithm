import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] time = new int[]{300, 60, 10};
        String answer = "";
        if (T % 10 != 0){
            System.out.println(-1);
        }
        else {
            for (int i=0; i<time.length; i++){
                answer += T / time[i] +" ";
                T %= time[i];
            }
            System.out.println(answer.substring(0,answer.length()-1));
        }
    }
}
