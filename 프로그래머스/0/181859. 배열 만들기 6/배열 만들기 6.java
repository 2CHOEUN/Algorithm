import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<Integer>();
        
        int i =0;
        do{
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else if(stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
                i++;
            }else if(stk.get(stk.size()-1) != arr[i]){
                stk.add(arr[i]);
                i++;
            }
            
        }while(i < arr.length);
        
        int[] answer = new int [stk.isEmpty() ? 1 : stk.size()];
        if(stk.isEmpty()){
            answer[0] = -1;
            return answer;
        }
        
        for(int j=0;j<answer.length;j++){
            answer[j] = stk.get(j);
        }
        
        
        return answer;
    }
}