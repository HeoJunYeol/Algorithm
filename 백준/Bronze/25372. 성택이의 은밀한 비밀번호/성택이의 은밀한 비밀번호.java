import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n;i++){
            String str = sc.nextLine().trim();
            if(6 <= str.length() && str.length() <= 9) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
