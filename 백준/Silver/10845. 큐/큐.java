import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (n --> 0){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")){
                queue.add(Integer.parseInt(st.nextToken()));
            } else if (str.equals("pop")) {
                if (queue.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(queue.poll()).append('\n');
                }
            } else if (str.equals("size")) {
                sb.append(queue.size()).append('\n');
            } else if (str.equals("empty")) {
                if (queue.isEmpty()){
                    sb.append(1).append('\n');
                }
                else {
                    sb.append(0).append('\n');
                }
            } else if (str.equals("front")) {
                if (queue.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(queue.peek()).append('\n');
                }
            } else if (str.equals("back")) {
                if (queue.isEmpty()){
                    sb.append(-1).append('\n');
                    
                }
                else {
                    for (int i = 0; i < queue.size(); i++) {
                        if (i == queue.size()-1){
                            sb.append(queue.peek()).append('\n');
                        }
                        queue.add(queue.poll());
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
