import java.util.HashSet;
import java.util.Scanner;

public class Main_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String data = sc.next().toUpperCase();

        for (int i=0; i<data.length(); i++) {
            arr[data.charAt(i) - 65]++;
        }

        int max = -1;
        char ch = '?';
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
