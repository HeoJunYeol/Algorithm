import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rs = new StringBuffer(s).reverse().toString();
        if (s.equals(rs)) System.out.println(1);
        else System.out.println(0);
    }
}
