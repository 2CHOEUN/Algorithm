class Solution {
    public String solution(String new_id) {
        // 1단계: 모든 대문자를 소문자로 변환
        String answer = new_id.toLowerCase();
        
        // 2단계: 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)만 남김
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        answer = answer.replaceAll("\\.{2,}", ".");
        
        // 4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        // 5단계: 빈 문자열이라면 "a"를 대입
        if (answer.isEmpty()) {
            answer = "a";
        }
        
        // 6단계: 길이가 16자 이상이면 첫 15개의 문자만 남김
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            // 제거 후 마침표(.)가 끝에 위치하면 제거
            answer = answer.replaceAll("[.]$", "");
        }
        
        // 7단계: 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 붙임
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}
