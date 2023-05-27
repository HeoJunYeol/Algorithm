class Solution {
    public int solution(int n) {
        int[] p = new int[n+1];
        p[0] = 0;
        p[1] = 1;
        for (int i=2; i<p.length;i++){
            p[i] = (p[i-1]+ p[i-2]) % 1234567;
        }
        return p[n];
    }
}