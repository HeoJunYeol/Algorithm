import java.util.Arrays;
import java.util.Scanner;

public class Main_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] alphabet = new int[26];
        for(int i = 0; i<alphabet.length; alphabet[i++]=-1);
        for(int i =0; i<s.length();i++){
            char ch =s.charAt(i);
            if(alphabet[ch-'a'] == -1) alphabet[ch - 'a'] = i;
        }
        System.out.println(Arrays.toString(alphabet).replace("[","").replace("]","").replaceAll(",",""));
    }
}
