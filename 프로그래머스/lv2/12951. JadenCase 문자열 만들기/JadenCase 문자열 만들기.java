import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        boolean b = true;
        for(char a : s.toCharArray()){
            if(b){
                answer.append(Character.toUpperCase (a));
            }else{
                answer.append(Character.toLowerCase (a));
            }
            if(Character.isSpaceChar(a)){
                b = true;
            }else{
                b = false;
            }
            

        }
        return answer.toString();
    }
}