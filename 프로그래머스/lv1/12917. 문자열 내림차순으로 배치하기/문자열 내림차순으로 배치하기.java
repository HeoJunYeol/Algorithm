import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = new String[s.length()];
        for (int i=0; i<s.length();i++){
            str[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(str,Collections.reverseOrder());
        return String.join("",str);
    }
}