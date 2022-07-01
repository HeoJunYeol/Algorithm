import java.util.Arrays;
import java.util.Scanner;

public class Main_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9] ;
        int maximum = -1;
        for(int i =0; i < 9; i++){
            num[i] = sc.nextInt();
            maximum = Math.max(maximum, num[i]);
        }

        System.out.println(maximum);
        for(int i = 0; i < num.length; i++){
            if(num[i] == maximum){
                System.out.println(i+1);
            }
        }
    }
}
