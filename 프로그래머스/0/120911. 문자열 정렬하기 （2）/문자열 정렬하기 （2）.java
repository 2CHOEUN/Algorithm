import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
       char str []= new char[my_string.length()];
        
        for(int i=0;i<my_string.length();i++){
            str[i] = my_string.charAt(i);
        }
        Arrays.sort(str);
         String answer = "";

        for (int i=0;i<str.length;i++){
            answer +=str[i];
        }
        return answer;
    }
}