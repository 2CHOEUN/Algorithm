class Solution {
    public int solution(int n) {
        
        String num = Integer.toString(n);
        int answer =0;
        
        for(int i=0;i<num.length();i++){
        answer += (num.charAt(i)-'0');
        }

        return answer;
    }
}