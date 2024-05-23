import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        ArrayList<Integer> list = new ArrayList <Integer>();
        
        for(int i = 0; i < intervals.length; i++){
            for(int z = 0; z < arr.length; z++){
                if(z >= intervals[i][0] && z <= intervals[i][1] ){
                    list.add(arr[z]);
                }
            }
            
            
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}