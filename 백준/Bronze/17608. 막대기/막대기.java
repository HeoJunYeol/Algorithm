import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(Integer.parseInt(br.readLine()));
        }
        int count =0;
        int max =0;
        for(int i=0;i<n;i++){
            int tmp = stack.pop();
            if(max < tmp){
                count ++;
                max = tmp;
            }
        }
        System.out.println(count);
    }
}