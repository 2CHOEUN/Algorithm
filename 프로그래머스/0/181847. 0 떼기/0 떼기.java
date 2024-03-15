import java.util.*;
class Solution {
    public String solution(String n_str) {
       StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) != '0'){
                for(int j = i ; j < n_str.length(); j++){
                    sb.append(n_str.charAt(j));
                }
                break;
            }
        }
        return sb.toString();
    }
}