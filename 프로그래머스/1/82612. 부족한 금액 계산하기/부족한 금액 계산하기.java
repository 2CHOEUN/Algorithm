class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i <= count; i++){
            answer += (price * i);
        }
        long result = money - answer;
        return result >= 0 ? 0 : Math.abs(result);
    }
}