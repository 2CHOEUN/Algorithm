class Solution {
    public int solution(int n, int k) {
     int answer = (n*12000)+(k*2000);
        
        for(int i=10;i<=n;i=i+10){
          answer = answer - 2000;
        }
        
    
        return answer;
    }
}