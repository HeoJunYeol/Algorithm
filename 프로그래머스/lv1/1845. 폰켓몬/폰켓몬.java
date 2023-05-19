import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int i:nums){
            s.add(i);
        }
        if(nums.length / 2 > s.size()){
            return s.size();
        }
        return nums.length/2;
    }
}