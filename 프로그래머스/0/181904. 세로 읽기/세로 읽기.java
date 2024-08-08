import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        
        ArrayList<String> arr = new ArrayList<String>();
        
        StringBuffer answer = new StringBuffer();
        
        for(int i = 0; i < my_string.length(); i = i + m){
            arr.add(my_string.substring(i, i + m));
        }
       
       for(int i = 0; i < arr.size(); i++){
            answer.append((arr.get(i)).charAt(c-1));
        }
        
        return answer.toString();
    }
}