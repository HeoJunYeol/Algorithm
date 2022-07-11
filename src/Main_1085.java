import java.util.Scanner;

public class Main_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        if((x <= w-x) && (y <= h-y)){
            System.out.println(Math.min(x,y));
        } else if ((x < w-x) && (y > h-y)) {
            System.out.println(Math.min(x,(h-y)));
        } else if ((x > w-x) && (y<h-y)) {
            System.out.println(Math.min((w-x),y));
        } else {
            System.out.println(Math.min((w-x),(h-y)));
        }
    }
}
