import java.util.*;
class Solution {
    public long solution(long n) {
        
        String num = n + "";
        String number [] = num.split("");
        
        Arrays.sort(number);
        
        num = "";
        
        for(int i = number.length -1; i >= 0; i--){
            num += number[i];
        }
        
        return Long.parseLong(num);
    }
}