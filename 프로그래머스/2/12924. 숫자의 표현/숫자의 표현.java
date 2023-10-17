class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        while(num <=n){
            int result = 0;
            
            for(int i=num;i<=n;i++){
                result += i;
                
                if(result == n){
                    answer ++;
                    break;
                }else if(result >=n){
                    break;
                }
            }
            num++;
        }
        return answer;
    }
}