import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        ArrayList <String> arr = new ArrayList <String>();
        
        for(int i = 0; i < names.length; i = i + 5){
            arr.add(names[i]);
        }
        
        String [] answer = new String[arr.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}