import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        ArrayList <Integer> array = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i < arr.length -1){
                if(arr[i] != arr[i+1]){
                    array.add(arr[i]);
                }
            }else{
                array.add(arr[i]);
            }
        }
        int[] answer = new int[array.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}