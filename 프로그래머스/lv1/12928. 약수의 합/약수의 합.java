import java.util.HashSet;

public class Solution {
    public int solution(int n) {
    HashSet<Integer> set = new HashSet<>();
        for (int i =1; i<=Math.sqrt(n); i++){
            if(n % i ==0){
                set.add(i);
                if(n % i != i){
                    set.add(n/i);
                }
            }
        }
        return set.stream().mapToInt(e -> e).sum();
    }
}
