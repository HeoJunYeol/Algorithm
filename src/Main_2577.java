import java.util.Scanner;

public class Main_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int[] numbers = new int[10];
        int answer = a*b*c;
        String[] s = Integer.toString(answer).split("");
        for(int i =0; i< s.length; i++) {
            numbers[Integer.parseInt(s[i])] += 1;
        }
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
