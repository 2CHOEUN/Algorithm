import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer answer = new StringBuffer();
        answer.append(my_string.substring(s, e + 1));
        answer.reverse();
        answer.insert(0,my_string.substring(0,s));
        answer.insert(e + 1,my_string.substring(e + 1, my_string.length()));
        return answer.toString();
    }
}