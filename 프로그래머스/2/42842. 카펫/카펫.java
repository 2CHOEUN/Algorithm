import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow;
     
         for(int width = 3;width<=Math.sqrt(total);width++){
             if(total % width ==0){
                 int height = total / width;
                 if((width - 2) * (height - 2)==yellow){
                     answer[0] = height;
                     answer[1] = width;
                    return answer;
                 }
             }

         }
        return answer;
    }
}