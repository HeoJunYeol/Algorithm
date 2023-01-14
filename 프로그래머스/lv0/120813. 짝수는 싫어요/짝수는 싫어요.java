import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<= n; i=i+2){
            arr.add(i);
        }
        return arr;
    }
}