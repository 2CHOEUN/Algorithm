class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer answer = new StringBuffer();
        for(int i = r; i < code.length(); i += q){
            answer.append(code.charAt(i));
        }
        return answer.toString();
    }
}