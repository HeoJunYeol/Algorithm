import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (n --> 0){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push_front")){
                dq.addFirst(Integer.parseInt(st.nextToken()));
            }
            else if (str.equals("push_back")){
                dq.addLast(Integer.parseInt(st.nextToken()));
            }
            else if (str.equals("pop_front")) {
                if (dq.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(dq.pollFirst()).append('\n');
                }
            }else if (str.equals("pop_back")) {
                if (dq.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(dq.pollLast()).append('\n');
                }
            } else if (str.equals("size")) {
                sb.append(dq.size()).append('\n');
            } else if (str.equals("empty")) {
                if (dq.isEmpty()){
                    sb.append(1).append('\n');
                }
                else {
                    sb.append(0).append('\n');
                }
            } else if (str.equals("front")) {
                if (dq.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else {
                    sb.append(dq.peekFirst()).append('\n');
                }
            } else if (str.equals("back")) {
                if (dq.isEmpty()){
                    sb.append(-1).append('\n');

                }
                else {
                    sb.append(dq.peekLast()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
