import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i:nums){
            s.add(i);
        }
        if(nums.length / 2 > s.size()){
            return s.size();
        }
        else return nums.length/2;
    }
}