import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> list =new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(list);
        int num = (int) Math.round(n*0.15);
        int size = n-(num*2);
        
        for (int i=num; i<list.size()-num;i++){
            sum += list.get(i);
        }
        
        System.out.println((int) Math.round((double) sum/size));
    }
}
