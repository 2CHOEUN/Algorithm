class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = Integer.toString(order);
        
        for(int i=0;i<num.length();i++){
           if(num.charAt(i)=='3'||num.charAt(i)=='6'||num.charAt(i)=='9'){
               answer ++;
           }
        }
        return answer;
    }
}