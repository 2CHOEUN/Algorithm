import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuffer br = new StringBuffer(my_string);
        
        for(int i=0;i<br.length()-1;i++){
            for(int j=i+1;j<br.length();j++){
                if(br.charAt(i) == br.charAt(j)){
                    br.deleteCharAt(j);
                    j--;
                }
            }
        }
        
        String answer = br.toString();
        return answer;
    }
}