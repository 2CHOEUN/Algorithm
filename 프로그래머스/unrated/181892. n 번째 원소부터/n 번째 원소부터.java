import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] answer = new int[num_list.length - n+1];
        ArrayList ans = new ArrayList();
        
        for(int i = n-1; i < num_list.length; i++){
            ans.add(num_list[i]);
        }
        for(int i = 0; i < ans.size(); i++){
            answer[i] = (int)ans.get(i);
        }
        return answer;
    }
}