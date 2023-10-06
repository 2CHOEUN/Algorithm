import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {

        ArrayList <Integer> arrList = new ArrayList<>();
        Map<Integer,Boolean> map = new LinkedHashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],true);
        }

        for(int i : map.keySet()){
            arrList.add(i);
        }
        int[] answer = new int[k];
        for(int i=0;i<answer.length;i++){
            if(i < arrList.size()){
                answer[i] = arrList.get(i);
            }else{
                answer[i] = -1;
            }
            
        }
        return answer;
    }
}