import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for(int i = 0; i < intStrs.length; i++){
            arr.add(intStrs[i].substring(s, s+l));
        }
        
        for(int i = 0; i < arr.size(); i++){
            if(Integer.parseInt(arr.get(i)) > k){
                num.add(Integer.parseInt(arr.get(i)));
            }
        }
        
        int[] answer = new int [num.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}