import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        int length = 0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
               answer[length++] = Math.abs(map.get(s.charAt(i))-i);
            map.put(s.charAt(i),i);
            }else{
                answer[length++] = -1;
                 map.put(s.charAt(i),i);
            }
        }
        return answer;
    }
}