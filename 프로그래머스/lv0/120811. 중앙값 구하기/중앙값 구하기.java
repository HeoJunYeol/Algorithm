import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        array = Arrays.stream(array).sorted().toArray();
        
        return array[array.length /2];
    }
}