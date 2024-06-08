class Solution {
    public int solution(int hp) {
        int answer = hp/5;
        int num1 = hp%5;
        
        if(hp%5!=0){
            answer += num1/3;
            num1 = num1%3;
            if (num1!=0){
                answer += num1;
            }
            
        }
        return answer;
    }
}