class Solution {
    public int solution(int n) {
        int answer = 0;

            for(int i=2;i<n;i++){
                if(n/i==i&&n%i==0){
                    return 1;
                }
                answer = 2;
            }
        return answer;
      
    }
}