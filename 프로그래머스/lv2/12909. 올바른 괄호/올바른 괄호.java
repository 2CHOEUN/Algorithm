class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count1 ++;
            }else{
                count2 ++;
            }
            
            if(count1 < count2){
                answer = false;
                break;
            }else if(count1==count2){
                answer = true;
            }else{
                answer = false;
            }
        }
        return answer;
    }
}