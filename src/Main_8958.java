import java.util.Scanner;

public class Main_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str;
        char[] problem;
        for(int i =0; i<t; i++){
            int count = 0;
            int result =0;
            str = sc.next();
            problem = new char[str.length()];
            for(int j=0; j<str.length(); j++){
                problem[j] = str.charAt(j);
            }
            for (char c : problem) {
                if (c == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                result += count;
            }
            System.out.println(result);
        }

    }
}
