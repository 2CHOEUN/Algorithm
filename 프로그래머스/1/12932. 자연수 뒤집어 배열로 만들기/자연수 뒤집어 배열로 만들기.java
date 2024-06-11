class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int num = 0;
        while(n > 0){
            answer[num++] = (int)(n % 10);
            n /= 10;
            if(num >= answer.length){
                break;
            }
        }
        return answer;
    }
}