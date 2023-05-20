import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i: arr){
            if(i % divisor == 0){
                list.add(i);
            }
        }
        if(list.size() == 0){
            return new int[]{-1};
        }
        int[] a = new int[list.size()];
        list.sort(Comparator.naturalOrder());
        for (int i =0; i<list.size(); i++){
            a[i] = list.get(i);
        }
        return a;
    }
}