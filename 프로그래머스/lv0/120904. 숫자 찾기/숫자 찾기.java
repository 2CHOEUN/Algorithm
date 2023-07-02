class Solution {
    public int solution(int num, int k) {
                int answer = -1;

        String num1 = Integer.toString(num);
        String k1= Integer.toString(k);
        
        for(int i=0;i<num1.length();i++){
            if(num1.charAt(i)==k1.charAt(0)){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}