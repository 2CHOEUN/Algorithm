import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        ArrayList <String> arr = new ArrayList <String>();
        for(int i = 0; i < my_string.length(); i++){
            arr.add(my_string.substring(i));
        }
        
        String [] answer = new String[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);

        return answer;
    }
}