class Solution {
    public String solution(String s) {
                String answer = "";
        String[] str = s.split("");
        int cnt = 0;

        for (String ss : str){
            cnt = ss.contains(" ") ? 0 : cnt+1;
            answer += cnt % 2 == 0 ?ss.toLowerCase() : ss.toUpperCase();
        }

        return answer;
    }
}