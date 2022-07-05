import java.util.Scanner;

public class Main_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        String answer = "";
        if (n[0].equals("1")) {
            for (int i = 0; i < n.length; i++) {
                if (i + 1 == Integer.parseInt(n[i])) {
                    answer = "ascending";
                } else {
                    answer = "mixed";
                    break;
                }
            }
        } else if (n[0].equals("8")) {
            for (int i = 0; i < n.length; i++) {
                if (8-i == Integer.parseInt(n[i])) {
                    answer = "descending";
                } else {
                    answer="mixed";
                    break;
                }
            }
        }else{
            answer = "mixed";
        }
        System.out.println(answer);
    }
}
