class Solution {
    public int solution(int n) {
        int answer =n+1;
        int cnt =Integer.toBinaryString(n).replace("0","").length();
        while (true){
            if((Integer.toBinaryString(answer).replace("0","").length()) == cnt){
                break;
            }
            answer++;

        }
        return answer;
    }
}