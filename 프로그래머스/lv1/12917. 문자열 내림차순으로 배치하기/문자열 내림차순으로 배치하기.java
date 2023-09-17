import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str,Comparator.reverseOrder());
        
        StringBuffer answer = new StringBuffer();
        for(int i=0;i<str.length;i++){
            answer.append(str[i]);
        }
        return answer.toString();
    }
}