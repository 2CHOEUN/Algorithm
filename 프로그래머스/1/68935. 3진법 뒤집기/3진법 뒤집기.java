import java.util.*;
class Solution {
    public int solution(int n) {
        StringBuffer br = new StringBuffer();
        while(n > 0){
            br.append(n % 3);
            n /= 3;
        }
        

        return Integer.parseInt(br.toString(), 3);
    }
}