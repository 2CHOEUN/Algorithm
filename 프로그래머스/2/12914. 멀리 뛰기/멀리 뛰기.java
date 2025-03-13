class Solution {
    public long solution(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        long a = 1, b = 2;
        
        for(int i = 3; i <= n; i++){
            long temp = (a + b) % 1234567;
            a = b;
            b = temp;
        }
        return b;
    }
}