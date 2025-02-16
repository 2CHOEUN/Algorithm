class Solution {
    public int solution(int balls, int share) {
        double answer = 0;
        double u = 1, d = 1;
        for(int i = share ; i > 0; i--){
            u *= balls;
            d *= i;
            balls--;
        }
        answer = u / d;
        return (int)answer;
    }
}