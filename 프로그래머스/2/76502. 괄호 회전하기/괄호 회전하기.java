import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < n; i++) {
            if (isValid(sb.toString())) {
                answer++;
            }
            
            // 문자열을 왼쪽으로 한 칸 회전
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
        }
        return answer;
    }

    // 올바른 괄호 문자열인지 확인하는 메서드
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatching(top, c)) return false;
            }
        }
        return stack.isEmpty();
    }

    // 괄호가 올바르게 짝을 이루는지 확인
    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
    