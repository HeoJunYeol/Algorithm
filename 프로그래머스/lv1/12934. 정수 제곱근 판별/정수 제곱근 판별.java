class Solution {
    public long solution(long n) {
        long answer = -1;
        double d = Math.sqrt(n);
        if (d % 1 ==0){
            answer = (long) Math.pow(d+1,2);
        }
        return answer;
    }
}