import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<progresses.length;i++){
            if ((100-progresses[i]) % speeds[i] ==0){
                queue.add((100-progresses[i]) / speeds[i]);
            }
            else queue.add((100-progresses[i]) / speeds[i] +1);
        }
        int tmp = queue.poll();
        int cnt =1;
        while (!queue.isEmpty()){
            if(tmp >= queue.peek()){
                cnt++;
                queue.poll();
            }
            else {
                arrayList.add(cnt);
                cnt =1;
                tmp = queue.poll();
            }
        }
        arrayList.add(cnt);
        int[] answer = new int[arrayList.size()];

        for (int i = 0; i <arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}