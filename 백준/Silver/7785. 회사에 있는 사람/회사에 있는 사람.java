import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        while (n --> 0){
            String[] s = br.readLine().split(" ");
            if (s[1].equals("enter")){
                set.add(s[0]);
            }
            else {
                set.remove(s[0]);
            }
        }
        List<String> answer = new ArrayList<>(set);
        Collections.sort(answer,Collections.reverseOrder());
        for (String str: answer){
            System.out.println(str);
        }
    }
}