class Solution {
    public String solution(String s) {
        String[] str = s.toLowerCase().split(" ");
        StringBuffer answer = new StringBuffer();
        for (int i=0; i<str.length;i++) {
            String tmp = str[i];
            if(str[i].length() == 0) {
                answer.append(" ");
            }
            else {
                answer.append(tmp.substring(0, 1).toUpperCase()).append(tmp.substring(1, tmp.length())).append(" ");
            }
        }
        if (s.substring(s.length()-1,s.length()).equals(" ")){
            return answer.toString();
        }
        return answer.substring(0, answer.length()-1);
    }
}