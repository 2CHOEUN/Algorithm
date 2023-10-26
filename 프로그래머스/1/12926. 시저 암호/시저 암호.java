class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder(); 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isWhitespace(c)) {
                answer.append(' '); 
            } else if (Character.isUpperCase(c)) {
                char shiftedChar = (char) ('A' + (c - 'A' + n) % 26);
                answer.append(shiftedChar);
            } else if (Character.isLowerCase(c)) {
                char shiftedChar = (char) ('a' + (c - 'a' + n) % 26);
                answer.append(shiftedChar);
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
