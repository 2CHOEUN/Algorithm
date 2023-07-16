import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> al = new ArrayList <Integer> ();
        
        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                for(int j = 1; j <= arr[i] * 2; j++){
                   al.add(arr[i]);
                }
            }else{
                 for(int j = 1; j <= arr[i]; j++){
                   al.remove(al.size()-1);
                }
            }
        }
        
        int[] answer = new int [al.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}