import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        int tmp = -1;
        for (int i :arr) {
            if(tmp != i){
                answer.add(i);
                tmp = i;

            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}