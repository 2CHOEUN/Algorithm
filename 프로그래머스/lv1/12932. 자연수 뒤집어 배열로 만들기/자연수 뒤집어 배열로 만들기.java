import java.util.*;
class Solution {
    public int[] solution(long n) {
        String num = n + "";
        int [] answer = new int[num.length()];
        
        for(int i = num.length()-1; i >= 0; i--){
            answer[num.length()-1 - i] = num.charAt(i) - '0';
        }
        return answer;
    }
}