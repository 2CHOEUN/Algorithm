import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList <Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j <= arr[i]; j++){
                answer.add(arr[i]);
            }
        }
        
        int [] num = new int [answer.size()];
        for(int i = 0; i < answer.size(); i++){
            num[i] = answer.get(i);
        }
        
        return num;
    }
}