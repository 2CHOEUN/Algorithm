import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList <String> arr = new ArrayList<String>();
        
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                arr.add(strArr[i]);
            }
        }
        
        String[] answer = new String [arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}