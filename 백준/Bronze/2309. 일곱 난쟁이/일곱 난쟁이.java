import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[9];
        int sum =0;
        for (int i=0; i<9; i++){
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }
        for (int i=0; i<8; i++){
            for (int j=i+1; j<9; j++){
                if (sum - nums[i] - nums[j] == 100){
                    nums[i] = 0;
                    nums[j] = 0;
                    Arrays.sort(nums);
                    for (int k=2; k<nums.length; k++){
                        System.out.println(nums[k]);
                    }
                    return;
                }
            }
        }
    }
}
