import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<food.length;i++){
            if(food[i] >= 2){
                int n = food[i]/2;
                for(int j=1;j<=n;j++){
                 answer.append(i);
                }
            }
        }
        StringBuilder answer2 = new StringBuilder(answer);
        answer.append("0");
        answer.append(answer2.reverse());
       
        return answer.toString();
    }
}