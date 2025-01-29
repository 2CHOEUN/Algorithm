import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int total = score.length;
        while(total >= m){
          answer += (score[total - m] * m);
          total -= m;
        }

        
        return answer;
    }
}