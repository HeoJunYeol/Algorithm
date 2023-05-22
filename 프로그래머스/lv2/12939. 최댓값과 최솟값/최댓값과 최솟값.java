import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] nums = new int[str.length];
        for (int i=0; i<nums.length; i++){
            nums[i] = Integer.valueOf(str[i]);
        }
        Arrays.sort(nums);
        answer = String.valueOf(nums[0]) + " " + String.valueOf(nums[nums.length-1]);
        return answer;
    }
}