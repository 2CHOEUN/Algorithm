class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            while (num > 0) { // num이 0보다 클 때만 반복
                if (num % 10 == 7) { // 마지막 자리가 7인지 확인
                    answer++;
                }
                num /= 10; // 다음 자리로 이동
            }
        }
        return answer;
    }
}