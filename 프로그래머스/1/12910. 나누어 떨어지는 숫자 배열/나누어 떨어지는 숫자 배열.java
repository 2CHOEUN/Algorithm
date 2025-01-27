
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Arrays.sort(arr);
        for(int i : arr){
            if(i % divisor == 0){
                arrList.add(i);
            }
        }
        int [] answer = new int[arrList.size()];
        if(arrList.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arrList.get(i);
            }
        }
        return answer;
    }
}