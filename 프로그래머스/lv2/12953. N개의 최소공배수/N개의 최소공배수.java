class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        int g = 0;
            for (int i=1; i<arr.length; i++) {
                g = gcd(answer, arr[i]);
                answer = (answer * arr[i]) / g;
            }
        return answer;
    }
    
    private static int gcd(int a, int b){
        int r = a % b;
        if (r == 0) return b;
        else return gcd(b,r);
    }
}