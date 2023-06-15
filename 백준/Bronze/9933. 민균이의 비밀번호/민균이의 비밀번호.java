import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        while (n --> 0){
            String s = sc.next();
            String rs = new StringBuffer(s).reverse().toString();
            if (list.contains(rs) || s.equals(rs)){
                System.out.println(s.length() + " " + s.charAt(s.length()/2));
                return;
            }
            else {
                list.add(s);
            }
        }
    }
}
