import java.util.*;
class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)){
            return 0;
        }
        StringBuffer br = new StringBuffer();
        int answer = 0;
        
        for(int i=A.length()-1;i>=0;i--){
            answer ++;
            br.append(A.substring(i));
            
            br.append(A.substring(0,i));
            
            
            if(br.toString().equals(B)){
                return answer;
            }
            br.delete(0,br.length());
        }
    
        return -1;
    }
}