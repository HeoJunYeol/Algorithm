import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        String[] s = new String[numbers.length];

        for (int i=0; i<s.length; i++){
            s[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(s, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(s[0].equals("0")){
            return "0";
        }

        StringBuilder answer = new StringBuilder();
        for (int i=0; i< s.length; i++){
            answer.append(s[i]);
        }

        return answer.toString();
    }
}