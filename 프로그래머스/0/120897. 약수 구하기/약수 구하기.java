import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList <Integer> arr = new ArrayList<Integer> ();
        
        for(int i = 1; i <= n;i ++){
            if(n % i == 0){
                arr.add(i);
            }
        }
        int [] answer = new int[arr.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
       
        
        return answer;
    }
}