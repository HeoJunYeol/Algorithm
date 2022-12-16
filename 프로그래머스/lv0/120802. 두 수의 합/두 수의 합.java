class Solution {
    public int solution(int num1, int num2) {
        boolean val = (num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000);
        int answer = -1;
        if(val){
        return num1 + num2;            
        }
        return answer;
    }
}