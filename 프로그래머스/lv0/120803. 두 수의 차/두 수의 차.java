class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean val = (num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000);
        if (val){
            return num1 - num2;
        }
        return answer;
    }
}