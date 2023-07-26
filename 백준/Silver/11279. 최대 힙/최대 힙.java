import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int num;
        while (n --> 0){
            num = Integer.parseInt(br.readLine());
            if (num > 0){
                queue.add(num);
            }
            else if (num ==0 && queue.isEmpty()){
                bw.write("0\n");
            }
            else {
                bw.write(queue.poll() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
