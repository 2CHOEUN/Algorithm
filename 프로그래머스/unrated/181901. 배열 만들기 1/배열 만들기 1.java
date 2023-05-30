import java.util.*;
class Solution {
    public ArrayList solution(int n, int k) {
        ArrayList answer = new ArrayList();
        for(int i = k; i <= n; i = i + k){
            answer.add(i);
        }
        return answer;
    }
}