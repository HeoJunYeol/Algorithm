class Solution {
    public int solution(int n) {
        int answer =0;
        int cnt =1;
        while (cnt <= n){
            int tmp =0;
            for (int i=cnt; i<= n; i++){
                tmp+=i;
                if (tmp == n){
                    answer++;
                    break;
                }
                else if(tmp > n){
                    break;
                }
            }
            cnt++;
        }

        return answer;
    }
}