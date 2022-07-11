import java.math.BigInteger;
import java.util.Scanner;

public class Main_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        BigInteger x = new BigInteger(s[0]);
        BigInteger y= new BigInteger(s[1]);

        int gcd = x.gcd(y).intValue();
        System.out.println(gcd);
        System.out.println((Integer.parseInt(s[0])*(Integer.parseInt(s[1]))/(gcd)));
    }
}
