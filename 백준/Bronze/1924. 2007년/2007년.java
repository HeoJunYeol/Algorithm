import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String[] s = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int cnt = 0;
        for (int i=1; i<x; i++){
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10){
                cnt += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                cnt += 30;
            }
            else {
                cnt += 28;
            }
        }
        cnt += y;
        System.out.println(s[cnt%7]);
    }
}
