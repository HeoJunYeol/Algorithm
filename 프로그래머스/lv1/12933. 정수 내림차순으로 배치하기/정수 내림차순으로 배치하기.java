import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        String s = "";
        Arrays.sort(str);
        for (int i=str.length-1; i>=0;i--){
            s += str[i];
        }
        return Long.valueOf(s);
    }
}