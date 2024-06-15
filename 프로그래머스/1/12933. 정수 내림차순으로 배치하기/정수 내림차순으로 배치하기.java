import java.util.*;
class Solution {
    public long solution(long n) {
        String [] str = String.valueOf(n).split("");
        Arrays.sort(str);
        StringBuilder br = new StringBuilder();
        for(int i = str.length-1; i >= 0; i--){
            br.append(str[i]);
        }
        
        return Long.parseLong(br.toString());
    }
}