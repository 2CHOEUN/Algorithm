import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        
        for(int i = 2; i <= n; i++){
            while (n % i == 0) {
                 n /= i;
                if(!arr.contains(i)){
                    arr.add(i);
                }
            }
        }
        
        int[] answer = new int [arr.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}