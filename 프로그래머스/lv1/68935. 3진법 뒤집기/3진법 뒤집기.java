class Solution {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer(Integer.toString(n,3));
        String s = sb.reverse().toString();
        return Integer.parseInt(s,3);
    }
}