import java.util.Arrays;
import java.util.Scanner;

public class Main_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        while (a != 0 && b!=0 && c !=0){
            int[] data = {a, b, c};
            Arrays.sort(data);
            if((Math.pow(data[0],2) + Math.pow(data[1],2)) == Math.pow(data[2],2)){
                System.out.println("right");
            }
            else System.out.println("wrong");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
    }
}
