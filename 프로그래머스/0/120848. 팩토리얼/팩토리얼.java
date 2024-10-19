class Solution {
    public int solution(int n) {
        
        
        int answer = 1;
        int count = 1;
        while(answer <= n){
            answer *= count;
            count ++;
        }
        count = count-2;
        return count;
    }
}