import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxVal = -1, maxValCnt = 0;
        for (int a:array) {
            int t = hashMap.getOrDefault(a,0) + 1;
            hashMap.put(a, t);
            if(maxValCnt < t){
                maxVal = a;
                maxValCnt = t;
            }
        }
        for(int a : hashMap.keySet()){
            if(hashMap.get(a) == maxValCnt && a != maxVal) return -1;
        }
        return maxVal;
    }
}