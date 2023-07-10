import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String [] str = myString.split("x");
        ArrayList <String> arr = new ArrayList<String>();     
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("")){
                continue;
            }
            arr.add(str[i]);
        }
        String [] answer = new String[arr.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}