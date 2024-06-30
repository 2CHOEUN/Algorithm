class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num != 1 && answer < 500){
            answer ++;
            num = num % 2 == 0 ? (num / 2) : (num * 3) + 1;
        
        }
        
        return answer >= 400 ? -1 : answer;
    }
}