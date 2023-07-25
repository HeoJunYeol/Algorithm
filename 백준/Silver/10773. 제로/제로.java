import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i=0; i<k; i++){
            int num = Integer.parseInt(br.readLine());
            if (num == 0){
                if (!list.isEmpty()){
                    int tmp = list.get(list.size()-1);
                    list.remove(list.size()-1);
                    sum-=tmp;
                }
            }
            else {
                list.add(num);
                sum += num;
            }
        }
        System.out.println(sum);

    }
}
