import java.util.*;
class Solution {
    public String solution(String s) {
         char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder br = new StringBuilder(String.valueOf(ch));
        return br.reverse().toString();
    }
}