class Solution {
    public int solution(int num) {
        int cnt =0;
        long n = num;
        while (cnt <= 500){
            if(n == 1){
                break;
            }
            else if(n % 2 == 0){
                n = n / 2;
            }
            else{
                n = (n * 3) + 1;
            }
            cnt++;
        }
        if(cnt <= 500){
            return cnt;
        }
        else return -1;
    }
}