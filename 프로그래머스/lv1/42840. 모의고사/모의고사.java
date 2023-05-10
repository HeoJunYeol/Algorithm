import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[][] n = new int[][]{{1,2,3,4,5}, 
                                {2,1,2,3,2,4,2,5}, 
                                {3,3,1,1,2,2,4,4,5,5}
                               };
        for(int i=0; i<answers.length; i++){
            for(int j=0; j<3; j++){
                if(j == 0){
                    if(answers[i] == n[j][i%5]){
                        answer[j]++;
                    }
                }
                else if(j == 1){
                    if(answers[i] == n[j][i%8]){
                        answer[j]++;
                    }
                }
                else if(j == 2){
                    if(answers[i] == n[j][i%10]){
                        answer[j]++;
                    }
                }
            }
        }
        
        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<answer.length; i++) if(max == answer[i]) answ.add(i+1);
        
        // int[] a = new int[answ.size()];
        // for(int i=0; i<a.length; i++){
        //     a[i] = answ.get(i);
        // }
        return answ.stream().mapToInt(i->i.intValue()).toArray();
    }
}