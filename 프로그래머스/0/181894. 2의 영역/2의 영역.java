import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int first = -1;
        int last = -1;
        
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 2){
                first = i;
                break;
            }
        }
        for(int i=arr.length-1; i >= 0; i--){
            if(arr[i] == 2){
                last = i;
                break;
            }
        }
        
        if(first == -1 && last == -1){
            int [] answer = {-1};
            return answer;
            
        }
        
        return Arrays.copyOfRange(arr,first,last+1);
    }
}