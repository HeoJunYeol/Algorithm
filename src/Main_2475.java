import java.util.Scanner;

public class Main_2475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        int sum =0;
        for(String num :numbers){
            sum += Math.pow(Integer.parseInt(num), 2);
        }
        System.out.println(sum%10);
    }
}
