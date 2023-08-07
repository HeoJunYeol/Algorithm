import java.io.*;
import java.util.*;
public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n <= 99) { 
            System.out.print(n);
            return;
        }
        count = 99;
        for (int i = 100; i <= n; i++) {
            d(i);
        }
        System.out.print(count);
    }

    static void d(int n) { 
        boolean b = true;
        String s = Integer.toString(n);
        int x = Character.getNumericValue(s.charAt(1)) - Character.getNumericValue(s.charAt(0));
        for (int i = 1; i < s.length() - 1; i++) {
            int c = Character.getNumericValue(s.charAt(i+1)) - Character.getNumericValue(s.charAt(i));
            if (x != c) { 
                b = false;
                break;
            }
        }
        if (b) count++; 
    }
}