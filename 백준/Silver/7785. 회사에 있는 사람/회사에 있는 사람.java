import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> hashMap = new HashMap<>();
        while (n --> 0){
            String[] s = br.readLine().split(" ");
            if (s[1].equals("enter")){
                hashMap.put(s[0],s[1]);
            }
            else {
                hashMap.remove(s[0]);
            }
        }
        List<String> key = new ArrayList<>(hashMap.keySet());
        Collections.sort(key,Collections.reverseOrder());
        for (String s: key){
            System.out.println(s);
        }
    }
}