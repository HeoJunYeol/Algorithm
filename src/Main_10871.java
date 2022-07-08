import java.util.Scanner;

public class Main_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , x;
        n = sc.nextInt();
        x = sc.nextInt();
        String str = "";
        for(int i =0; i<n; i++){
            int data = sc.nextInt();
            if(data < x) str += data + " ";
        }
        System.out.println(str);
    }
}
