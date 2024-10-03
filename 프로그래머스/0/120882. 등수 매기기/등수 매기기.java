import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        
        Map<Double,Integer> map = new HashMap<Double,Integer>();
        
        Double [] avg = new Double[score.length];
        Double [] avgCopy = new Double[score.length];

        int[] answer = new int[score.length];
        for(int i=0;i < score.length;i++){
            avg[i] = (double)(score[i][0] + score[i][1]) / 2;
            avgCopy[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        Arrays.sort(avg);
        int rank = 1;
        
        for(int i=answer.length-1;i >=0;i--){
            if(!map.containsKey (avg[i])){
                map.put(avg[i],rank++);
            }else{
                rank ++;
            }
        }
        for(int i=0;i<answer.length;i++){
           answer[i] = map.get(avgCopy[i]);
        }
        
        return answer;
    }
}