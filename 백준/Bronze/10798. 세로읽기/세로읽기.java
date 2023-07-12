import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];
        String str = "";
        int max = 0;
        for (int i=0; i<s.length; i++){
            s[i] = sc.nextLine();
            if (max < s[i].length()){
                max = s[i].length();
            }
        }
        for (int i=0 ;i<max; i++){
            for (int j=0; j<s.length; j++){
                if (i < s[j].length()){str += s[j].charAt(i);}
            }
        }
        System.out.println(str);
    }
}
