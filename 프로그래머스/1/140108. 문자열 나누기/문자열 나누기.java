class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
        int answer = 0;
        
        int xCount = 1; //x와 같은 수
        int count = 0; //x와 다른 수 
        
        for(int i = 1; i < s.length(); i++){
            if(xCount == count){
                answer ++;
                x = s.charAt(i);
                xCount = 0;
                count = 0;
            }
            if(s.charAt(i) == x){
                xCount ++;
            }else{
                count ++;
            }
        }
        
        if(xCount != 0 || count != 0) answer ++;
    
        return answer;
    }
}