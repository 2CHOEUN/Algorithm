import java.util.*;
class Solution {
    public int solution(String my_string) {
        
        String [] num = my_string.split(" ");
        int answer = Integer.parseInt(num[0]);

        for(int i = 0; i<num.length;i++){
            if(num[i].equals("+") && i < num.length){
                answer += Integer.parseInt(num[i+1]);
            }else if(num[i].equals("-") && i < num.length){
                answer -= Integer.parseInt(num[i+1]);
            }
        }
  
        return answer;
    }
}