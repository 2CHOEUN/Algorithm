import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList <Integer> array = new ArrayList <Integer>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                array.add(arr[i]);
            }
        }

        if(array.isEmpty()){
            array.add(-1);
        }

        
        int[] answer = new int [array.size()];
        for(int i = 0; i< answer.length; i++){
            answer[i] = array.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}