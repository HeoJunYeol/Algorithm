import java.util.Scanner;

public class Main_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t -= 1;
            int n = sc.nextInt();
            String[] s = sc.next().split("");
            String p = "";
            for(String c : s){
                for(int i = 0; i < n; i++){
                    p += c;
                }
            }
            System.out.println(p);
        }

    }
}
