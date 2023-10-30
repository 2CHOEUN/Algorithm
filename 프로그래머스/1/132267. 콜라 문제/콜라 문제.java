class Solution {
    public int solution(int a, int b, int n) {
       int answer = 0;

        while(n >= a){
           int num = (n / a) * a;
            n = n - num + (num/a*b);

            answer += (num/a) * b ;
            
        }
        return answer;
    }
}