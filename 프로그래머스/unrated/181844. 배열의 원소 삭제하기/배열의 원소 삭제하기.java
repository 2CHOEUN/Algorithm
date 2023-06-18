import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        ArrayList <Integer> arrList = new ArrayList <Integer> ();
        for(int i = 0; i < arr.length; i++){
            int num = 0;
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    num = 1;
                    break;
                }
            }
            if(num == 1){
                continue;
            }
             arrList.add(arr[i]);
        }
        
        
        int[] answer = new int [arrList.size()];
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}