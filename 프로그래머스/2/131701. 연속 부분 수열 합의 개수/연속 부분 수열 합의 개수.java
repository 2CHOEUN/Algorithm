import java.util.*;
class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<Integer>();
        int n = elements.length;
        
        //원형 수열 처리를 위해 배열을 2배로 확장
        int[] extended = new int[n * 2];
        
        for (int i = 0; i < n; i++) {
            extended[i] = elements[i];
            extended[i + n] = elements[i];
        }
        // 모든 길이에 대해 부분 수열 합 계산
        for (int length = 1; length <= n; length++) { // 길이 1부터 n까지
            for (int start = 0; start < n; start++) { // 시작 인덱스
                int sum = 0;
                for (int k = 0; k < length; k++) { // 부분 수열의 합 계산
                    sum += extended[start + k];
                }
                set.add(sum); // 중복 제거를 위해 HashSet에 추가
            }
        }

        return set.size(); // 중복 제거된 합의 개수 반환
    }
}