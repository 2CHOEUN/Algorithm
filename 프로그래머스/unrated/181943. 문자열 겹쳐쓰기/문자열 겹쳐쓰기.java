class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
     StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (i >= s && i < s + overwrite_string.length()) {
                sb.append(overwrite_string.charAt(i - s));
            } else {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}