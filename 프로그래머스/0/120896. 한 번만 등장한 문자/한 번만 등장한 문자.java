import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split("");
        
        for(int i = 0;i < str.length - 1; i++){
            for(int j = i+1 ;j < str.length; j++){
                if(str[i].equals(str[j])){
                    s = s.replaceAll(str[i],"");
                }
            }
        }
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        answer = new String(ch);
        return answer;
    }
}