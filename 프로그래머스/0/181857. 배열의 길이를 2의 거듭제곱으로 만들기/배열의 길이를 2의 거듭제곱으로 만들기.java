import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList <Integer>list = new ArrayList<Integer>();
        for(int i=1;i <= 10000000;i *= 2){
            list.add(i);
        }
        
        int arrlength = arr.length;
        for(int i=0;i<list.size();i++){
            if(list.get(i) >= arr.length){
                arrlength = list.get(i);
                break;
            }
        }
        answer = Arrays.copyOf(arr,arrlength);
        return answer;
    }
}