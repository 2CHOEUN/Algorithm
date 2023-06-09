import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        
        StringBuffer br = new StringBuffer();
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                br.append('B');
            }else{
               br.append('A'); 
            }
        }
        
        return br.toString().contains(pat) ? 1 : 0;
    }
}