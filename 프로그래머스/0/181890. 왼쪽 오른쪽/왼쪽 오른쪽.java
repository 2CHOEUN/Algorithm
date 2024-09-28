import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        int l = Arrays.asList(str_list).indexOf("l"); 
        int r = Arrays.asList(str_list).indexOf("r");
        
        String[] answer = {};
        if(l ==-1 && r == -1){
            return answer;
        }

        if(l<r && l != -1 || r ==-1){
            answer = Arrays.copyOfRange(str_list,0,l);
        }else if(l>r && r != -1 || l ==-1){
            answer = Arrays.copyOfRange(str_list,r+1,str_list.length);

        }
        return answer;
    }
}