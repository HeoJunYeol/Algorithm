class Solution {
    public long solution(int a, int b) {
    if(a == b){
        return a;
        }
    if(a < b){
        return (long) (b - a + 1) * (a + b) /2;
    }else {
        return (long) (a - b + 1) * (a + b) /2;
    }
    }
}