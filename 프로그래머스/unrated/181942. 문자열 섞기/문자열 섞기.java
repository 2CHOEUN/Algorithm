import java.util.*;
class Solution {
    public String solution(String str1, String str2) {
        
        StringBuffer br = new StringBuffer();
        
        for(int i = 0; i < str1.length(); i++){
            br.append(str1.charAt(i));
            br.append(str2.charAt(i));
         }
        return br.toString();
    }
}