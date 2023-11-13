import java.util.*;
class Solution{
    public int solution(String s){
        int answer = 0;
        StringBuilder br = new StringBuilder(s);

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < br.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == br.charAt(i)) {
                stack.pop();
            } else {
                stack.push(br.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            answer = 1;
        }
  
        return answer;
    }
}