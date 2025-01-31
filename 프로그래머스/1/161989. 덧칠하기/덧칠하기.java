class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0; //롤러 마지막 구역
        for(int x : section){
            if(x >= last){
                last = x + m;
                answer ++;
            }
        }
        return answer;
    }
}