class Solution {
    public int solution(String[] babbling) {
           int answer = 0;
        
        // 유효한 발음들: 연속된 발음을 방지하려면 `aya`, `ye`, `woo`, `ma`의 순서만 가능
        String pattern = "^(aya|ye|woo|ma)*$";  // 발음이 이 패턴으로만 구성될 수 있도록
        
        for (String word : babbling) {
            // 연속된 발음이 없도록 조건 추가: "(aya|ye|woo|ma)(?!\\1)"
            // "(aya|ye|woo|ma)"는 발음이 나오면, 그다음에는 같은 발음이 나오지 않도록 하는 조건
            if (word.matches(pattern.replaceAll("(aya|ye|woo|ma)", "$1(?!$1)"))) {
                answer++;
            }
        }
        
        return answer;
    }
}