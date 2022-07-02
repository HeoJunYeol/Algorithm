import java.util.Scanner;

public class Main_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        StringBuffer revereda = new StringBuffer(a);
        a = revereda.reverse().toString();
        StringBuffer reveredb = new StringBuffer(b);
        b = reveredb.reverse().toString();
        int answer = Math.max(Integer.parseInt(a),Integer.parseInt(b));
        System.out.println(answer);

    }
}
