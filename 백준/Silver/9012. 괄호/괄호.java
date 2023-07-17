import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<String> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T--> 0){
            String[] str = br.readLine().split("");
            System.out.println(s(str));
        }
    }

    static String s(String[] str) {
        stack = new Stack<>();
        for(int i=0; i<str.length; i++){
            if (str[i].equals("(")){
                stack.push(str[i]);
            }
            else if (stack.isEmpty()){
                return "NO";
            }
            else{
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            return "YES";
        }
        else {
            return "NO";
        }
    }

}
