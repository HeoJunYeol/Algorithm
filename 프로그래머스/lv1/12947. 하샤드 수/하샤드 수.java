class Solution {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        String[] s = str.split("");
        int answer =0;
        for(int i=0; i<s.length;i++){
            answer += Integer.parseInt(s[i]);
        }
        if(x % answer == 0){
            return true;
        }
        else return false;
    }
}