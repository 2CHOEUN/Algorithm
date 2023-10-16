import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        int count = 0;
        int zero = 0;
        
        while(!s.equals("1")){
            int deleteZero = 0;
            count ++;
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    deleteZero ++;
                }
            }
            s = ""+Integer.toBinaryString(s.length() - deleteZero);
            zero += deleteZero;
        }
        
        int[] answer = {count,zero};
        return answer;
    }
}