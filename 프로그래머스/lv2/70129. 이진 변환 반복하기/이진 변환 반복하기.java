class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String tmp;
        while (s.length() != 1){
            tmp = "";
            for (int i=0; i<s.length();i++){
                if(s.charAt(i) == '0'){
                    answer[1]++;
                }
                else tmp += s.charAt(i);
            }
            s = Integer.toBinaryString(tmp.length());
            answer[0]++;
        }
        return answer;
    }
}