import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int answer = 0;
        int total = 0;

        for (int i = 0; i < d.length; i++) {
            total += d[i];
            if (total > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
